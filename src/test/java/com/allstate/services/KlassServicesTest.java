package com.allstate.services;

import com.allstate.entities.Klass;
import com.allstate.enums.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql("/sql/klass.sql")
public class KlassServicesTest {

    KlassServices klassServices;

    @Autowired
    public void setKlassServices(KlassServices klassServices) {
        this.klassServices = klassServices;
    }

    @Test
    public void createKlass(){
        Klass klass = new Klass();
        klass.setDepartment(Department.LITERATURE);
        klass.setFee(800.00);
        klass.setName("hindi");
        klass.setSemester(Calendar.getInstance().getTime());

        klassServices.createKlass(klass);
        assertEquals(3,klass.getId());

    }




}