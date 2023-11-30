package com.validations.commonvalidations.dependency;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileNoValidator implements ConstraintValidator<MobileNo,String> {
    @Override
    public void initialize(MobileNo constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String mobileNo, ConstraintValidatorContext constraintValidatorContext) {
        return mobileNo != null && mobileNo.matches("^[0-9]{10}$");
    }
}
