package br.com.fapa.entityUniversity;

import java.util.List;

public class Turma {
    private List<Aluno> listaDeAlunos;
    private List<Disciplina> listaDeDisciplinas;
    private int idTurma;
    private Professor professor;

    public Turma(List<Aluno> listaDeAlunos, List<Disciplina> listaDeDisciplinas, int idTurma, Professor professor) {
        this.listaDeAlunos = listaDeAlunos;
        this.listaDeDisciplinas = listaDeDisciplinas;
        this.idTurma = idTurma;
        this.professor = professor;
    }
}
