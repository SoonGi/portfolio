package com.yoon.portfolio.account;

import static java.util.stream.Collectors.toList;

import com.yoon.portfolio.role.Role;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * AccountService
 */
@Service
public class AccountServiceImpl implements UserDetailsService, AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ModelMapper modelMapper;

    // @Autowired
    // private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByName(username)
            .orElseThrow(() -> new AccountNotFoundException("There is no user which have name \" " + username + "\""));


        String[] roles =
        account.getRoles().stream()
            .map(Role::getName)
            .collect(toList())
            .toArray(String[]::new);

        return User.builder()
                .username(account.getName())
                .password(account.getPassword())
                .roles(roles)
                .build();
    }

    public Account createAccount(AccountDto accountDto) {
        return modelMapper.map(accountDto, Account.class);
    }
}