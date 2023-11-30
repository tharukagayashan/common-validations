package com.validations.commonvalidations.dependency;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MailValidator implements ConstraintValidator<Mail,String> {
    @Override
    public void initialize(Mail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
    }
}
