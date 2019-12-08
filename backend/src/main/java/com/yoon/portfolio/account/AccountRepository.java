package com.yoon.portfolio.account;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AccountRepository
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByName(String name);
}