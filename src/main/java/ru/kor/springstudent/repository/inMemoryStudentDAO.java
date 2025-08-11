package ru.kor.springstudent.repository;

import org.springframework.stereotype.Repository;
import ru.kor.springstudent.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class inMemoryStudentDAO {
    private final List<Student> STUDENTS= new ArrayList<>();


    public List<Student> findAllStudent() {
        return STUDENTS;
    }


    public Student updateStudent(Student student) {
        var studentIndex= IntStream.range(0,STUDENTS.size())
                .filter(index->STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1){
            STUDENTS.set(studentIndex,student);
            return student;
        }
        return null;
    }


    public void deleteStudent(String email) {
        var student= findStudentByEmail(email);
        if(student!=null) STUDENTS.remove(student);

    }


    public Student addStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student findStudentByEmail(String email) {
        return STUDENTS.stream().filter(s->s.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}
