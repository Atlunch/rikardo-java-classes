package de.neuefische.rikardo.javaclasses.model;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int id;
    private String email;

    public Student(String name, int age, int id, String email) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name) &&
                email.equals(student.email) && id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id, email);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Alter: " + this.age + ", Id: " + this.id + ", E-Mail: " + this.email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public void setEmail(String email){

        this.email = email;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
