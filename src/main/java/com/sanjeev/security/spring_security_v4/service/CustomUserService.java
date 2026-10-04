package com.sanjeev.security.spring_security_v4.service;

import com.sanjeev.security.spring_security_v4.bean.UserBean;
import com.sanjeev.security.spring_security_v4.repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;

public class CustomUserService implements UserDetailsService {
    private static final Logger LOGGER= LoggerFactory.getLogger(CustomUserService.class);

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LOGGER.info("in CustomUserService loadUserByUsername starts"+username);
        UserBean userBean = userRepo.findByUserName(username);
        // 1. Add the null check here
        if (userBean == null) {
            LOGGER.warn("User not found in database for username: " + username);
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        //return new User(userBean.getUserName(), userBean.getPassword(), new HashSet<>());
        return User.withUsername(userBean.getUserName()).password(userBean.getPassword()).build();
    }

}
