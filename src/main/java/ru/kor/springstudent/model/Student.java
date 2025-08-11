package ru.kor.springstudent.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


@Data
@Builder
@Entity
@Table (name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    @Column (unique = true)
    private String email;
    @Transient
    private int age;
    private LocalDate dateOfBirth;
}
