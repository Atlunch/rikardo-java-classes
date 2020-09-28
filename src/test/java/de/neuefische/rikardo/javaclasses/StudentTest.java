package de.neuefische.rikardo.javaclasses;

import de.neuefische.rikardo.javaclasses.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void checkName() {
        //GIVEN
        Student student = new Student("Felix",18,"felix@gmail.com");
        //WHEN
        boolean isNotEmpty = student.getName().isEmpty();
        //THEN
        assertFalse(isNotEmpty);
    }

    @Test
    void checkAge() {
        //GIVEN
        Student student = new Student("Felix",18,"felix@gmail.com");
        //WHEN
        int age = student.getAge();
        //THEN
        assertEquals(18,age);
    }


    @Test
    void checkEmail() {
        //GIVEN
        Student student = new Student("Felix",18,"felix@gmail.com");
        //WHEN
        //String email = student.getEmail();
        //THEN
        assertEquals("felix@gmail.com",student.getEmail());
    }

    @Test
    void testToString() {
        Student student = new Student("Felix",18,"felix@gmail.com");

        String result = student.toString();

        assertEquals("Name: Felix, Alter: 18, E-Mail: felix@gmail.com", result);
    }

}