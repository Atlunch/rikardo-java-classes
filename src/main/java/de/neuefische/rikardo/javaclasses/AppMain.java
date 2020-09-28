package de.neuefische.rikardo.javaclasses;

import de.neuefische.rikardo.javaclasses.db.StudentDB;
import de.neuefische.rikardo.javaclasses.model.Student;

public class AppMain {

    public static void main(String[] args) {
        Student student01 = new Student("Felix",18, 1,"felix@gmail.com");
        Student student02 = new Student("Tom",20, 2,"tom@gmail.com");

        Student[] students = {student01,student02};
        StudentDB studentsDB = new StudentDB(students);


        Student student03 = new Student("Nils",20, 3,"nils@gmail.com");

        studentsDB.add(student03);

        System.out.println(student03);

        System.out.println(studentsDB.toString());

        studentsDB.remove(student01);

        System.out.println(studentsDB.toString());


    }
}
