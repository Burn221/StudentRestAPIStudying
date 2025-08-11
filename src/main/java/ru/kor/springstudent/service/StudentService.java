package ru.kor.springstudent.service;

import org.springframework.stereotype.Service;
import ru.kor.springstudent.model.Student;

import java.util.List;


public interface StudentService {
     List<Student> findAllStudent();
     Student updateStudent(Student student);
     void deleteStudent(String email);
     Student addStudent(Student student);
     Student findStudentByEmail(String email);





}
