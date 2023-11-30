package com.validations.commonvalidations.dependency;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GenderValidator.class)
public @interface Gender {

    String message() default "Gender should be M or F";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
