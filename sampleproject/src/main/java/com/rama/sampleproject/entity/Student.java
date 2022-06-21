package com.rama.sampleproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="student_data")
@Data
@AllArgsConstructor 
@NoArgsConstructor
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String studentName;
    private String studentEmail;
    private int age;

   /* @ManyToMany
    @JoinTable(name="student_course",joinColumns=@JoinColumn(name = "student_id"),inverseJoinColumns=@JoinColumn(name = "course_id"))
    private List<Course> courses;*/
}

