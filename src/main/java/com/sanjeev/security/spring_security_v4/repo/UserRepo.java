package com.sanjeev.security.spring_security_v4.repo;

import com.sanjeev.security.spring_security_v4.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserBean, Long> {

    UserBean findByUserName(String userName);
}
