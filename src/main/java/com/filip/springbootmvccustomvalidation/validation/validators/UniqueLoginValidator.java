package com.filip.springbootmvccustomvalidation.validation.validators;

import com.filip.springbootmvccustomvalidation.repositories.UserRepository;
import com.filip.springbootmvccustomvalidation.validation.interfaces.UniqueLogin;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueLoginValidator implements ConstraintValidator<UniqueLogin, String> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void initialize(UniqueLogin constraint) {

    }

    @Override
    public boolean isValid(String login, ConstraintValidatorContext constraintValidatorContext) {
        return login != null && !userRepository.findByLogin(login).isPresent();
    }
}
