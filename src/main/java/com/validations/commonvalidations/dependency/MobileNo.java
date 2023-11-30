package com.validations.commonvalidations.dependency;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MobileNoValidator.class)
public @interface MobileNo {

    String message() default "Mobile number should be 10 digits long";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
