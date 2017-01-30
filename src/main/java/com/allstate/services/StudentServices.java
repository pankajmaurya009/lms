package com.allstate.services;

import com.allstate.entities.Student;
import com.allstate.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {


    private IStudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
         return studentRepository.save(student);
    }

    public Student findByStudentId(int i) {
        return studentRepository.findOne(i);
    }

    public Student findByStudentEmail(String s) {
        return studentRepository.findByEmail(s);
    }
}
