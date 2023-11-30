package com.validations.commonvalidations.dependency;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MailValidator.class)
public @interface Mail {

    String message() default "Email must be a valid email address";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
