package ru.kor.springstudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kor.springstudent.model.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    void deleteByEmail(String email);
    Optional<Student> findByEmail(String email);

}
