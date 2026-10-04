package com.sanjeev.security.spring_security_v4.repo;

import com.sanjeev.security.spring_security_v4.bean.StudentBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentBean, Long> {


}
