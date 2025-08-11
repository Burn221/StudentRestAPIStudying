package ru.kor.springstudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kor.springstudent.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    void deleteByEmail(String email);
    Student findByEmail(String email);

}
