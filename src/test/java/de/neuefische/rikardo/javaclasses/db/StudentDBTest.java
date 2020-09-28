package de.neuefische.rikardo.javaclasses.db;

import de.neuefische.rikardo.javaclasses.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void testToString() {

        Student student01 = new Student("Felix",18, 1,"felix@gmail.com");
        Student student02 = new Student("Tom",20, 2,"tom@gmail.com");
        Student[] students = {student01,student02};
        StudentDB studentsDB = new StudentDB(students);


        String result = studentsDB.toString();
        assertEquals(student01.toString() + ";" + student02.toString() + ";", result);

    }

    @Test
    void testAdd() {
        Student student01 = new Student("Felix",18, 1,"felix@gmail.com");
        Student student02 = new Student("Tom",20, 2,"tom@gmail.com");
        Student[] students = {student01};
        StudentDB studentsDB = new StudentDB(students);

        studentsDB.add(student02);

        int afterLength = studentsDB.getStudents().length;

        assertEquals(2,afterLength);


    }

    @Test
    void testRemove() {
        Student student01 = new Student("Felix",18, 1,"felix@gmail.com");
        Student student02 = new Student("Tom",20, 2,"tom@gmail.com");
        Student[] students = {student01,student02};
        StudentDB studentsDB = new StudentDB(students);

        studentsDB.remove(student02);

        int afterLength = studentsDB.getStudents().length;

        assertEquals(1,afterLength);


    }





}