package com.collections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    String name;
    int rollNum;

    Student(String name, int rollNum){
        this.name = name;
        this.rollNum = rollNum;

    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Student Roll Number: " + rollNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNum == student.rollNum;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNum);
    }
}


public class CustomHashSet {
    static void main() {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Mohammed", 101));
        students.add(new Student("Alamgir", 102));
        students.add(new Student("Muwahhid", 103));
        students.add(new Student("Mohammed", 101)); // does not add duplicate since we are using equals and hashcode

        for (Student student : students) {
            System.out.println(student);
        }
      //  System.out.println(students);


    }
}
