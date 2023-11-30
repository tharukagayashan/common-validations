package com.validations.commonvalidations.dependency;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<Gender, String> {
    @Override
    public void initialize(Gender constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String gender, ConstraintValidatorContext constraintValidatorContext) {
        if (gender.equals("M") || gender.equals("F") || gender.equals("m") || gender.equals("f")) {
            return true;
        } else if (gender.equals("MALE") || gender.equals("FEMALE") || gender.equals("male") || gender.equals("female")) {
            return true;
        } else {
            return false;
        }
    }
}
