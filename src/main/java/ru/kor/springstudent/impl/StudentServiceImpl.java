package ru.kor.springstudent.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.kor.springstudent.model.Student;
import ru.kor.springstudent.repository.StudentRepository;
import ru.kor.springstudent.service.StudentService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student) ;
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
    public Optional<Student> findStudentByEmail(String email) {
        return repository.findByEmail(email);
    }
}
