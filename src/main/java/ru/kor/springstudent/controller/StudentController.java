package ru.kor.springstudent.controller;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kor.springstudent.model.Student;
import ru.kor.springstudent.service.StudentService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent(){
        return service.findAllStudent();
    }

    @PostMapping ("save_student")
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @GetMapping ("/{email}")
    public Student findStudentByEmail(@PathVariable String email){
        return service.findStudentByEmail(email);
    }

    @PutMapping ("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping ("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}
