package de.neuefische.rikardo.javaclasses;

public class AppMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Felix");
        student.setAge(18);
        student.setEmail("felix@gmail.com");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getEmail());
    }
}
