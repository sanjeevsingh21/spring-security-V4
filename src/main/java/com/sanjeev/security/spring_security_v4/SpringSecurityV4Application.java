package com.sanjeev.security.spring_security_v4;

import com.sanjeev.security.spring_security_v4.bean.StudentBean;
import com.sanjeev.security.spring_security_v4.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class SpringSecurityV4Application {
    private static final Logger LOGGER= LoggerFactory.getLogger(SpringSecurityV4Application.class);

    @Autowired
    private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityV4Application.class, args);

	}

    /*@EventListener(ApplicationReadyEvent.class)
    void init(){
        LOGGER.info("this is test method to check database/JPA connectivity, start");
        List<StudentBean> studentBeans = studentService.displayAllStudent();
        studentBeans.forEach(bean ->
                        System.out.println(bean)
                );
        LOGGER.info("this is test method to check database/JPA connectivity, end");
    }*/

}
