package ru.kor.springstudent.impl;

import lombok.AllArgsConstructor;
import ru.kor.springstudent.model.Student;
import ru.kor.springstudent.repository.StudentRepository;
import ru.kor.springstudent.service.StudentService;

import java.util.List;
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);

    }

    @Override
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findByEmail(email);
    }
}
