package br.com.fapa.entityUniversity;

import java.util.ArrayList;
import java.util.List;

public class Course extends Discipline {
    private String name;
    private List<Discipline> disciplinesList;
    private List<Student> studentList;
    private int duration;
    private String code;

    public Course(String name, String code) {
        this.studentList = new ArrayList<>();
        this.disciplinesList = new ArrayList<>();
        this.name = name;
        this.code = code;
//        this.disciplinesList = disciplinesList;
//        this.studentList = studentList;
//        this.duration = duration;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public void includeStudent(Student student){
        studentList.add(student);
        System.out.println(studentList);
        System.out.println(studentList);
    }

    public void includeDisciplines(Discipline discipline){
        disciplinesList.add(discipline);
    }

//    private void listDisciplines(Course )

    private void listStudentsByCourse(int id){
        studentList.forEach(s -> s.getCourseId());
    }

    public void getDisciplines() {
        System.out.println(disciplinesList);
    }

    @Override
    public String toString() {
        return "\nCourse{" +
                "name='" + name + '\'' +
                ", disciplinesList=" + disciplinesList +
                ", studentList=" + studentList +
                ", duration=" + duration +
                '}';
    }
}
