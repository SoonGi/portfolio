package com.yoon.portfolio.account;

import static org.assertj.core.api.Assertions.assertThat;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * AccountRepositoryTest
 */
@DataJpaTest
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    @Transactional
    public void create() {
        Account account =
        Account.builder()
            .name("name")
            .password("password")
            .build();

        Account created = accountRepository.save(account);
        assertThat(created).isNotNull();
        assertThat(created.getId()).isNotNull();
    }

    @Test
    @Transactional
    public void findByUserName() {
        Account account =
        Account.builder()
            .name("tester")
            .password("testerpw")
            .build();

        accountRepository.save(account);
        Account retrieved = accountRepository.findByName(account.getName()).get();
        assertThat(retrieved.getName()).isEqualTo(account.getName());
    }
}