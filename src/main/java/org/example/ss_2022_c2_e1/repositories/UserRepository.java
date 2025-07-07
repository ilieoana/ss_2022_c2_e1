package org.example.ss_2022_c2_e1.repositories;

import org.example.ss_2022_c2_e1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

// we don t have to use @Repository in interface
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("""
            SELECT u FROM User u
            WHERE u.username = :username
            """)
    Optional<User> findByUsername(String username);

}
