package br.com.fapa.entityUniversity;

import java.util.ArrayList;
import java.util.List;

public class Coordinator extends Course {
    private List<Course> courseList;
    private List<Course> courses;


    public Coordinator(String name, String code) {
        super(name, code);
        courses = new ArrayList<>();
    }

//    public void listCoursesAll(List courses){
//        System.out.println(courses);
//    }

    @Override
    public String toString() {
        return "Coordinator{" +
                "courseList=" + courseList +
                ", disciplineList=" +
                '}';
    }
}
