package de.neuefische.rikardo.javaclasses.model;

public class Student {

    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
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

    public String toString() {
        return "Name: " + this.name + ", Alter: " + this.age + ", E-Mail: " + this.email;
    }



}
