package com.security.Security.Controller;

import com.security.Security.Entity.Repository.StudentRepository;
import com.security.Security.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repo;
    @GetMapping("/public/hello")
    public String hello(){
        return "ye api khula hai";
    }
    @GetMapping("/students")
    public List<StudentEntity>getAll(){
        return repo.findAll();
    }
    @PostMapping("/students")
    public StudentEntity addStudent(@RequestBody StudentEntity student){
        return  repo.save(student);
    }


}
