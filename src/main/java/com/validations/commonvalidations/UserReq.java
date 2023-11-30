package com.validations.commonvalidations;

import com.validations.commonvalidations.dependency.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserReq {
    private String name;
    @Age
    private Integer age;
    @Mail
    private String email;
    @Password
    private String password;
    @MobileNo
    private String mobileNumber;
    @Gender
    private String gender;
}
