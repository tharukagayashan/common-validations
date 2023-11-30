package com.validations.commonvalidations;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/api")
public class TestController {

    @PostMapping("/test")
    public ResponseEntity<?> test(@Valid @RequestBody UserReq userReq){
        return ResponseEntity.ok(userReq);
    }

}
