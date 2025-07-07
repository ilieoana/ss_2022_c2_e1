	- In SecurityConfig class I create @Bean passwordEncoder() method to tell Spring Security how I want my password to be encoded an return the PasswordEncoder object; (used NoOpPasswordEncoder class that implements PasswordEncoder and is a singletone class  (static final INSTANCE and private construct)
	- Implements UserDetailsService and override method to load user by username. 
	- For this we have to create the UserDetails class, because data comes into a specific format.
	- For this, we created SecurityUser that implements UserDetails and have to implements methods,including getAuthority() that returns GrnatedAuthority, which needs a class SecurityAuthority create by us that implements this.

In that way we create authentication for a user inserted by us in database and give him some authorities in action form.