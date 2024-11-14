package br.com.fapa.entityUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Graduacao extends Curso implements Matricula {
    private int semestres;
    private List<Disciplina> disciplinas;
    private List<Aluno> listaDeAlunos;

    public Graduacao(String name, String code, int semestres, List<Disciplina> disciplinas) {
        super(name, code);
        this.semestres = semestres;
        this.disciplinas = disciplinas;
//        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Aluno> getListaDeAlunos() {
        List<Aluno> listaDeAlunos = new ArrayList<>();
        return listaDeAlunos;
    }

    public void matricularAluno(String codigoCurso, List<Aluno> alunosDoCursoGraduacao, Optional<Graduacao> cursoEncontrado, Aluno aluno, Map<Graduacao, List<Aluno>> alunosPorGraduacao) {
        if (cursoEncontrado.isPresent()) {
            Graduacao curso = cursoEncontrado.get();
            alunosDoCursoGraduacao.add(aluno);
            System.out.println(alunosPorGraduacao.get(curso));
            alunosPorGraduacao.put(curso, alunosDoCursoGraduacao);
            System.out.println("Aluno(a) matriculado com sucesso no curso " + curso.getName());
        } else {
            System.out.println("Curso com código " + codigoCurso + " não encontrado.");
        }
    }


    @Override
    public String toString() {
        return "Graduacao{" +
                "name" + getName()
                + "code" + getCode() +
                "semestres=" + semestres +
                ", disciplinas=" + disciplinas +
                ", listaDeAlunos=" + listaDeAlunos +
                '}';
    }

    @Override
    public void generateRegistrationNumber() {


    }
}
