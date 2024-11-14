package br.com.fapa.entityUniversity;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Curso {
    private List<Curso> cursoList;
    private List<Curso> cours;


    public Coordenador(String name, String code) {
        super(name, code);
        cours = new ArrayList<>();
    }

//    public void listCoursesAll(List cours){
//        System.out.println(cours);
//    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "cursoList=" + cursoList +
                ", disciplineList=" +
                '}';
    }
}
