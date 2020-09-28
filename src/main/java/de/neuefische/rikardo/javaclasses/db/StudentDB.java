package de.neuefische.rikardo.javaclasses.db;

import de.neuefische.rikardo.javaclasses.model.Student;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.ArrayUtils;

public class StudentDB {
    
    private Student[] students;
    
    public StudentDB(Student[] students) {
        this.students = students;
    }
    
    public Student[] list() {
        return this.students;
    }

    public  String toString() {
        String result = "";

        for (int i = 0; i < students.length; i++) {
            result += students[i] + ";";
        }
        return result;
    }

    public Student randomStudent() {
        int randomNumber = (int) (Math.random() * students.length);
        System.out.println(randomNumber);
        return students[randomNumber];
    }

    public void add(Student student){
        /*
        Student[] newstudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newstudents[i] = students[i];
        }
        newstudents[newstudents.length - 1] = student;

        setStudents(newstudents);

         */

        students = ArrayUtils.add(students,student);
    }

    public void remove(Student student) {
        students = ArrayUtils.removeElement(students,student);
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }



}
