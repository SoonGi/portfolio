package com.yoon.portfolio.account;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * AccountTest
 */
public class AccountTest {

    @Test
    public void javaBean() {
        Account account = new Account();
        account.setId(3L);
        account.setName("name");
        account.setPassword("password");

        assertThat(account).isNotNull();
        assertThat(account.getName()).isEqualTo("name");
    }

    @Test
    public void builder() {
        Account account =
        Account.builder()
            .name("name")
            .password("password")
            .id(3L)
            .build();

        assertThat(account).isNotNull();
        assertThat(account.getName()).isEqualTo("name");
    }
}