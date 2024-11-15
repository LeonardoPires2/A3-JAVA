package br.com.fapa.entityUniversity;

import java.util.List;

public class Professor extends Pessoa {
    private int idProfessor;
    private List<Disciplina> listaDisciplinas;
    private List<Turma> listaDeTurmas;

    public Professor(String name, String cpf, int idade, List<Disciplina> listaDisciplinas, List<Turma> listaDeTurmas) {
        super(name, cpf, idade);
        this.listaDisciplinas = listaDisciplinas;
        this.listaDeTurmas = listaDeTurmas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void displayInfo() {

    }
}
