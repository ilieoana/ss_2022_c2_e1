package org.example.ss_2022_c2_e1;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Ss2022C2E1Application {

    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(Ss2022C2E1Application.class, args);
    }

    @PostConstruct
    public void inspectBeans() {
        PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
        System.out.println("PasswordEncoder bean: " + encoder.getClass().getName());
    }

}
