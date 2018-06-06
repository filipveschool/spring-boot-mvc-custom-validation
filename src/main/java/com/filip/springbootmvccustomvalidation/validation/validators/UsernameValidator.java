package com.filip.springbootmvccustomvalidation.validation.validators;

import com.filip.springbootmvccustomvalidation.services.UserService;
import com.filip.springbootmvccustomvalidation.validation.interfaces.NotExistingUsername;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * The first generic is the annotation interface that this is bind to. => NotExistingUsername
 * The second generic is the type of object that will passed in this validator.
 * Since we are validating the username, then its a string type.
 */
public class UsernameValidator implements ConstraintValidator<NotExistingUsername, String> {

    @Override
    public void initialize(NotExistingUsername notExistingUsername) {

    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return !isUsernameExist(username);
    }

    private boolean isUsernameExist(String username) {
        //for simplicity, we just check if the username is 'user'
        if (username.equals("user")) {
            return true;
        }
        return false;
    }
}
