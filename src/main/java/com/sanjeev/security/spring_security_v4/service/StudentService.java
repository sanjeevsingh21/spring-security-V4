package com.sanjeev.security.spring_security_v4.service;

import com.sanjeev.security.spring_security_v4.bean.StudentBean;
import com.sanjeev.security.spring_security_v4.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    
    public List<StudentBean> displayAllStudent(){
        List<StudentBean> allStudent = studentRepo.findAll();
        if (allStudent!=null){
            return allStudent;
        }
        return new ArrayList<>();
    }
    
}
