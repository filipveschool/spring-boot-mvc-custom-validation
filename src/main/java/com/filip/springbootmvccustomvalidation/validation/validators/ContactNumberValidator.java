package com.filip.springbootmvccustomvalidation.validation.validators;

import com.filip.springbootmvccustomvalidation.validation.interfaces.ContactNumberConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {
    public void initialize(ContactNumberConstraint constraint) {
    }

    public boolean isValid(String contactField, ConstraintValidatorContext context) {
        return contactField != null && contactField.matches("[0-9]+")
                && (contactField.length() > 8) && (contactField.length() < 14);
    }
}
