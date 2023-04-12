package com.study.springboot.enumeration;

import lombok.Getter;

@Getter
public enum UserRole {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
