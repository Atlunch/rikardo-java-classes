package de.neuefische.rikardo.javaclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void checkName() {
        //GIVEN
        Student student = new Student();
        student.setName("Felix");
        //WHEN
        boolean isNotEmpty = student.getName().isEmpty();
        //THEN
        assertFalse(isNotEmpty);
    }

    @Test
    void checkAge() {
        //GIVEN
        Student student = new Student();
        student.setAge(18);
        //WHEN
        int age = student.getAge();
        //THEN
        assertEquals(18,age);
    }


    @Test
    void checkEmail() {
        //GIVEN
        Student student = new Student();
        student.setEmail("felix@gmail.com");
        //WHEN
        //String email = student.getEmail();
        //THEN
        assertEquals("felix@gmail.com",student.getEmail());
    }

}