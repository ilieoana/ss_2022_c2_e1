
In that way we create authentication for a user inserted by us in database and give him some authorities in action form.

# Spring Security Fundamentals - Managing users

This project is based on **Lesson 2 - Managing users** from
the [Spring Security Fundamentals](https://www.youtube.com/playlist?list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP) tutorial
series by **Laur Spilca** on
YouTube.

## 📚 Tutorial Reference

- **Author:** Laur Spilca
- **Series:** Spring Security Fundamentals
- **Lesson:** 2 -Managing users
- **Link:** [Watch on YouTube](https://www.youtube.com/watch?v=dFvbHZ8CuKM&list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP&index=2)

## 🛠️ What I Did

This project was implemented as part of my learning journey with Spring Security. I followed the tutorial closely and:

- Recreated the project from scratch in my local environment.
- In SecurityConfig class I created @Bean passwordEncoder() method to tell Spring Security how I want my password to be encoded and return the PasswordEncoder object; (used NoOpPasswordEncoder class that implements PasswordEncoder and is a singleton class)
- Implemented UserDetailsService and override method to load user by username from database (used jpa).
- Created the UserDetails class, because data comes into a specific format.
- Created SecurityUser that implements UserDetails and had to implements methods, including getAuthority() that returns GrantedAuthority, which needs a class SecurityAuthority to implement this.
