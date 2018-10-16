package com.adeveloperdiary.springbootibm.controller;

import com.adeveloperdiary.springbootibm.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/rest")
public class StudentController {

    @GetMapping(value = "/student")
    public HashMap<Long, Student> getAllStudents() {
        return getStudentHelpMethod();
    }

    @PostMapping(value = "/add")
    public Student addStudent( @RequestParam(value = "name") String name,
                               @RequestParam(value = "subject") String subject ) {
        return new Student( 99, name, subject ) ;
    }

    @PutMapping(value = "/update")
    public Student updateStudent( @RequestBody Student student ) {
        return new Student( 99, "Mary", "Java" ) ;
    }

    private HashMap<Long, Student> getStudentHelpMethod() {
        Student one = new Student( 1,"John", "math" );
        Student two = new Student( 2,"Jane", "history" );

        HashMap<Long, Student> studentHashMap = new HashMap<>();

        studentHashMap.put( one.getId(), one );
        studentHashMap.put( two.getId(), two );

        return studentHashMap;
    }
}
