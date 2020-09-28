package de.neuefische.rikardo.javaclasses;

import de.neuefische.rikardo.javaclasses.model.Student;

public class AppMain {

    public static void main(String[] args) {
        Student student = new Student("Felix",18,"felix@gmail.com");


        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getEmail());
    }
}
