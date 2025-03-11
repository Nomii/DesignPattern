package com.design.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        CollegeStudent collegeStudent = new CollegeStudent("a","b","c");
        SchoolStudent schoolStudent = new SchoolStudent("x","y","z");
        students.add(collegeStudent);
        //students.add(students); // This one is in-compatible, now here we want to introduce Adapter
        students.add(new SchoolStudentAdapter(schoolStudent));
        return students;
    }
}
