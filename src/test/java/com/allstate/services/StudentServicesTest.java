package com.allstate.services;

import com.allstate.entities.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql("/sql/seed.sql")
public class StudentServicesTest {

    @Autowired
    StudentServices studentServices;

    @Test
    public void  createStudent(){
        Student student = new Student();
        student.setEmail("student@123.com");

        studentServices.createStudent(student);
        assertEquals(4,student.getId());
        assertEquals("student@123.com",student.getEmail());
    }

    @Test
    public void  findStudentById(){

        Student student = studentServices.findByStudentId(3);
        assertEquals("test3@allstate.com",student.getEmail());
    }

    @Test
    public void  findStudentByEmail(){

        Student student = studentServices.findByStudentEmail("test2@allstate.com");
        assertEquals(2,student.getId());
    }

}
