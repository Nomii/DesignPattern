package com.design.patterns.structural.adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentClient client = new StudentClient();
        List<Student> students = client.getStudents();
        System.out.println(students);
    }
}
