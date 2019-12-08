package com.yoon.portfolio.account;

import java.util.List;

import com.yoon.portfolio.role.Role;
import com.yoon.portfolio.role.RoleDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * AccountDto
 */
@Builder
@Getter @Setter
public class AccountDto {

    private String name;
    private String password;
    private List<RoleDto> roles;
}