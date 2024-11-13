package br.com.fapa.entityUniversity;

public abstract class Person {
    protected String name;
    protected String cpf;
    protected String age;

    public Person(String name, String cpf, String age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    public String getNome() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdade() {
        return age;
    }
    public abstract void displayInfo();
}