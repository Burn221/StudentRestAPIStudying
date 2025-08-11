package ru.kor.springstudent.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kor.springstudent.model.Student;
import ru.kor.springstudent.repository.inMemoryStudentDAO;
import ru.kor.springstudent.service.StudentService;

import java.util.List;
@Service
@AllArgsConstructor
public class inMemoryStudentServerImplementation implements StudentService {
    private final inMemoryStudentDAO repository;


    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);

    }

    @Override
    public Student addStudent(Student student) {
        return repository.addStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }
}
