package com.sanjeev.security.spring_security_v4.service;

import com.sanjeev.security.spring_security_v4.bean.UserBean;
import com.sanjeev.security.spring_security_v4.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private UserRepo userRepo;

    public boolean registerUser(UserBean userBean) {
        UserBean save = userRepo.save(userBean);
        if (save!=null)
            return true;
        return false;
    }
}
