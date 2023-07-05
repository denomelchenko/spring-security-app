package com.denomelchenko.spring.security.util;


import com.denomelchenko.spring.security.models.User;
import com.denomelchenko.spring.security.serices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    private final UserService userService;

    @Autowired
    public UserValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        if (userService.findByUsername(user.getUsername()).isPresent()) {
            errors.rejectValue("username", "", "Username already registered");
        }
    }
}
