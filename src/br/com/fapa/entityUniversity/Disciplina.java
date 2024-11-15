package br.com.fapa.entityUniversity;

import java.util.Random;

public class Disciplina implements Matricula {
    private String nome;
    private int id;

    Random random = new Random();

    public Disciplina(String nome) {
        this.nome = nome;
        setId(generateRegistrationNumber());
    }

    public void setId(int id) {
        this.id = id;
    }

    public Disciplina() {
    }

    public String getName() {
        return nome;
    }

    @Override
    public String toString() {
        return "Displina: " + nome + '\n' +
               "Id: " + id + '\n';
    }

    @Override
    public int generateRegistrationNumber() {
        int min = 200;
        int max = 300;
        return random.nextInt(max - min + 1) + min;
    }
}
