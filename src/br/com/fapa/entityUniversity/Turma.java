package br.com.fapa.entityUniversity;

import java.util.List;
import java.util.Random;

public class Turma implements Matricula {
    public List<Aluno> listaDeAlunos;
    private Disciplina disciplina;
    private int idTurma;
    private Professor professor;

    Random random = new Random();

    public Turma(List<Aluno> listaDeAlunos, Disciplina disciplina, Professor professor) {
        this.listaDeAlunos = listaDeAlunos;
        this.disciplina = disciplina;
        this.idTurma = generateRegistrationNumber();
        this.professor = professor;
    }

    public Turma() {
    }

    @Override
    public String toString() {
        return "Turma: " + idTurma + "\n" + disciplina;
    }

    public void retornaProfessor() {
        System.out.println(this.professor.getNome() + " - " + disciplina.getName());
    }

    public void retornaDisciplina() {
        System.out.println(this.disciplina.getName());
    }

    @Override
    public int generateRegistrationNumber() {
        int min = 200;
        int max = 300;
        return random.nextInt(max - min + 1) + min;
    }
}
