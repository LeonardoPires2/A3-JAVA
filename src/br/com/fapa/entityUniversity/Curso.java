package br.com.fapa.entityUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Curso extends Disciplina {
    private String name;
    private List<Disciplina> disciplinesList;
    private List<Aluno> alunoList;
    private int duration;
    private String code;

    public Curso(String name, String code) {
        this.alunoList = new ArrayList<>();
        this.disciplinesList = new ArrayList<>();
        this.name = name;
        this.code = code;
//        this.disciplinesList = disciplinesList;
//        this.alunoList = alunoList;
//        this.duration = duration;
    }

    public Curso() {

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


    public void includeStudent(Aluno aluno){
        alunoList.add(aluno);
        System.out.println(alunoList);
        System.out.println(alunoList);
    }

    public void includeDisciplines(Disciplina disciplina){
        disciplinesList.add(disciplina);
    }

//    private void listDisciplines(Curso )

    private void listStudentsByCourse(int id){
        alunoList.forEach(s -> s.getCourseId());
    }

    public void getDisciplines() {
        System.out.println(disciplinesList);
    }

    @Override
    public String toString() {
        return "\nCurso{" +
                "name='" + name + '\'' +
                ", disciplinesList=" + disciplinesList +
                ", alunoList=" + alunoList +
                ", duration=" + duration +
                '}';
    }
}
