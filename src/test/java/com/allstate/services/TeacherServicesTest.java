package com.allstate.services;

import com.allstate.entities.Teacher;
import com.allstate.enums.Gender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value ="/sql/teachers.sql")
public class TeacherServicesTest {
    TeacherServices teacherServices;

    @Autowired
    public void setTeacherServices(TeacherServices teacherServices) {
        this.teacherServices = teacherServices;
    }

    @Test
    public void createTeacher(){
        Teacher teacher = new Teacher();

        teacher.setName("teacher3");
        teacher.setAge(25);
        teacher.setGender(Gender.FEMALE);

        Teacher teacher2 = teacherServices.createTeacher(teacher);

        assertEquals(3,teacher.getId());

    }




}
