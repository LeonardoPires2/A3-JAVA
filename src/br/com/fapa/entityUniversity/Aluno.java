package br.com.fapa.entityUniversity;

import java.util.Random;
import java.util.Scanner;

public class Aluno extends Pessoa implements Matricula {
    private int idMatricula;
    private String cursoId;
    private String telefone;
    private String email;
    Scanner ler = new Scanner(System.in);
    Random random = new Random();

    public Aluno(String name, String cpf, int idade, String cursoId, String telefone, String email) {
        super(name, cpf, idade);
        this.cursoId = cursoId;
        this.telefone = telefone;
        this.email = email;
        this.idMatricula = generateRegistrationNumber();
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Curso: " + cursoId + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email=" + email + "\n";
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Nome: " + this.nome + "\n" +
                        "RA: " + idMatricula + "\n" +
                        "Curso Id: " + cursoId + "\n" +
                        "Email: " + email + "\n" +
                        "Telefone: " + telefone + "\n"
        );
    }

    public void editarMatricula() {
        System.out.println("""
                Selecione para editar:
                1. Nome
                2. Email
                3. Telefone
                4. Idade
                5. CPF
                6. Sair
                """);
        int opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o nome");
                String nome = ler.next();
                setNome(nome);
                break;
            case 2:
                System.out.println("Digite seu email");
                String email = ler.next();
                setEmail(email);
                break;
            case 3:
                System.out.println("Digite seu telefone");
                String telefone = ler.next();
                setTelefone(telefone);
                break;
            case 4:
                System.out.println("Digite sua idade");
                int idade = ler.nextInt();
                setIdade(idade);
                break;
            case 5:
                System.out.println("Digite seu cpf");
                String cpf = ler.next();
                setCpf(cpf);
                break;
            case 6:
                break;
            default:
                System.out.println("Selecione uma opção válida");
        }
    }

    @Override
    public int generateRegistrationNumber() {
        int min = 200000000;
        int max = 300000000;
        return random.nextInt(max - min + 1) + min;
    }
}
