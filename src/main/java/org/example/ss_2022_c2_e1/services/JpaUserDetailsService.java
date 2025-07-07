package org.example.ss_2022_c2_e1.services;

import lombok.AllArgsConstructor;
import org.example.ss_2022_c2_e1.repositories.UserRepository;
import org.example.ss_2022_c2_e1.security.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    // @Bean // you can put @Bean instead of @Service
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var u = userRepository.findByUsername(username);
        return u.map(SecurityUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found" + username));
    }
}