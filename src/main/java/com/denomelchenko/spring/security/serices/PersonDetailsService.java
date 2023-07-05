package com.denomelchenko.spring.security.serices;

import com.denomelchenko.spring.security.models.User;
import com.denomelchenko.spring.security.repositories.UserRepository;
import com.denomelchenko.spring.security.security.UsersDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public PersonDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(s);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("Username not found!");
        }
        return new UsersDetails(user.get());
    }
}
