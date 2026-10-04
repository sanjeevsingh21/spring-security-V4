package com.sanjeev.security.spring_security_v4.controller;

import com.sanjeev.security.spring_security_v4.bean.UserBean;
import com.sanjeev.security.spring_security_v4.service.UserRegistrationService;
import org.apache.catalina.core.ApplicationMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRegistrationService customUserService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/signup", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerUser(@RequestBody UserBean userBean) {
        // 1. Check if the entire payload is missing, or if mandatory fields are null
        if (userBean == null || userBean.getUserName() == null || userBean.getPassword() == null) {
            return "Registration failed: Invalid user data provided";
        }
        userBean.setPassword(passwordEncoder.encode(userBean.getPassword()));
        boolean status = customUserService.registerUser(userBean);
        if (status) {
            return "user loaded";
        }
        return "user not loaded";
    }
}
