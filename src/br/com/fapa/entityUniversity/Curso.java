package br.com.fapa.entityUniversity;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Curso implements Matricula {
    private String name;
    private String code;
    Scanner ler = new Scanner(System.in);
    Random random = new Random();

    public Curso(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public int generateRegistrationNumber() {
        int min = 200;
        int max = 300;
        return random.nextInt(max - min + 1) + min;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void confirmacaoExclusao(){
        System.out.println("Tem certeza que deseja excluir a matrícula? (sim/não)");
        String resposta = ler.nextLine().toLowerCase();

        boolean confirmacao = false;
        while (true) {
            if (resposta.equals("sim")) {
                confirmacao = true;
                break;
            } else if (resposta.equals("não")) {
                break;
            } else {
                System.out.println("Resposta inválida. Digite 'sim' ou 'não'.");
                resposta = ler.nextLine().toLowerCase();
            }
        }
    }

    public int validacaoDeExclusao(int selecao, int saida){
        while(selecao != saida){
            System.out.printf("Digite %d para sair: ", saida );
            selecao = ler.nextInt();
        }
        return selecao;
    }

    public void excluirMatricula(List<Aluno> listaAlunoGraduacao) {
        listaAlunoGraduacao.remove(listaAlunoGraduacao.size() - 1);
        System.out.println("Sua matricula foi excluida!");
    }
}
