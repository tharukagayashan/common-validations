package com.validations.commonvalidations.dependency;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

    String message() default "Age must be a number and greater than 0";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
