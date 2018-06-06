package com.filip.springbootmvccustomvalidation.validation.interfaces;

import com.filip.springbootmvccustomvalidation.validation.validators.UsernameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// means that the annotation is applicable in class fields and in class or interface.
@Target({ElementType.FIELD, ElementType.TYPE})
// means that the annotation will be evaluated at runtime using reflection.
@Retention(RetentionPolicy.RUNTIME)
// this define the actual implementation of the interface.
@Constraint(validatedBy = UsernameValidator.class)
// this define the actual implementation of the interface.
@Documented
public @interface NotExistingUsername {

    String message() default "{com.filip.springbootmvccustomvalidation.NotExistingUsername.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    // The above methods are required when creating custom validators.
}

