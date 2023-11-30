package com.validations.commonvalidations.dependency;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
public @interface Password {

    String message() default "Password must be at least 8 characters long and contain at least one number, one uppercase letter, one lowercase letter and one special character";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
