package ru.kor.springstudent.service;

import org.springframework.stereotype.Service;
import ru.kor.springstudent.model.Student;

import java.util.List;
import java.util.Optional;


public interface StudentService {
     List<Student> findAllStudent();
     Student updateStudent(Student student);
     void deleteStudent(String email);
     Student addStudent(Student student);
     Optional<Student> findStudentByEmail(String email);





}
