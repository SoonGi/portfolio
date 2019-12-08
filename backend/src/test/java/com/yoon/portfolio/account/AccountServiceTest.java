package com.yoon.portfolio.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.yoon.portfolio.role.RoleDto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * AccountServiceTest
 */
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void createAccount() {

        RoleDto admin =
        RoleDto.builder()
            .name("ADMIN")
            .build();

        RoleDto user =
        RoleDto.builder()
            .name("USER")
            .build();
        List<RoleDto> roleDtoes = List.of(admin, user);

        AccountDto dto =
        AccountDto.builder()
            .name("name")
            .password("password")
            .roles(roleDtoes)
            .build();

        Account created = accountService.createAccount(dto);

        assertThat(created).isNotNull();
        assertThat(created.getName()).isEqualTo(dto.getName());
        assertThat(created.getRoles()).isNotNull();
        assertThat(created.getRoles().get(0).getName()).isEqualTo("ADMIN");
    }
}