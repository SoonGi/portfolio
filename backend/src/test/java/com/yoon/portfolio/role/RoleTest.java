package com.yoon.portfolio.role;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * RoleTest
 */
public class RoleTest {

    @Test
    public void javaBean() {
        Role role = new Role();
        role.setName("name");

        assertThat(role).isNotNull();
        assertThat(role.getName()).isEqualTo("name");
    }

    @Test
    public void builder() {
        Role role =
        Role.builder()
            .name("name")
            .build();

        assertThat(role).isNotNull();
        assertThat(role.getName()).isEqualTo("name");
    }
}