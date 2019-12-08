package com.yoon.portfolio.role;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * RoleRepositoryTest
 */
@DataJpaTest
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void save() {
        Role role =
        Role.builder()
            .name("name")
            .build();

        Role created = roleRepository.save(role);

        assertThat(created).isNotNull();
        assertThat(created.getName()).isEqualTo("name");
    }
}