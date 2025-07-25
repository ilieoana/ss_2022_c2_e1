package org.example.ss_2022_c2_e1.security;

import lombok.AllArgsConstructor;
import org.example.ss_2022_c2_e1.entities.Authority;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}