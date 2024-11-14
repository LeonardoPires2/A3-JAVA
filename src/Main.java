import br.com.fapa.entityUniversity.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ///Listas
        List<Disciplina> listaDisciplinasGraduacao = new ArrayList<>();
        List<Disciplina> listaDisciplinasDePosGraduacao = new ArrayList<>();
        Map<Graduacao, List<Aluno>> alunosPorGraduacao = new HashMap<>();
        Map<PosGraduation, List<Aluno>> alunosPorPosGraduacao = new HashMap<>();
        List<Graduacao> listaDeGraduacao = new ArrayList<>();
        List<PosGraduation> listaDePosGraduacao = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        List<Aluno> alunosDoCursoGraduacao = new ArrayList<>();
        List<Aluno> alunosDoCursoPosGraduacao = new ArrayList<>();

        Aluno aluno1 = new Aluno("Leonardo", "850204500", 20, "12", "51302303232", "leonardo.carvalho");
        Aluno aluno2 = new Aluno("Brenda", "850204500", 24, "12", "51302303232", "brenda..");
        Aluno aluno3 = new Aluno("Monique", "850204500", 24, "12", "51302303232", "monique@..");

        Disciplina bd = new Disciplina("Banco de dados", "BD101");
        Disciplina engenharia = new Disciplina("Engenharia de software", "EG202");
        Disciplina devWeb = new Disciplina("Desenvolvimento Web", "EG203");

        Graduacao engenhariaDaComputacao = new Graduacao("Engenharia da Computação", "10", 8, listaDisciplinasGraduacao);
        Graduacao cienciaDaComputacao = new Graduacao("Ciência da Computação", "11", 4, listaDisciplinasGraduacao);
        Graduacao ads = new Graduacao("Análise e Desenvolvimento de Sistemas", "12", 5, listaDisciplinasGraduacao);
        Graduacao gestao = new Graduacao("Gestão TI", "13", 5, listaDisciplinasGraduacao);
        PosGraduation banco = new PosGraduation("Banco de dados", "14", 2, listaDisciplinasDePosGraduacao);
        PosGraduation data = new PosGraduation("Ciência de dados", "15", 1, listaDisciplinasDePosGraduacao);

        alunosDoCursoGraduacao.add(aluno1);
        alunosDoCursoGraduacao.add(aluno2);
        alunosDoCursoPosGraduacao.add(aluno3);
        alunosPorGraduacao.put(engenhariaDaComputacao, alunosDoCursoGraduacao);

        ///includes disciplinas
        engenhariaDaComputacao.includeDisciplines(engenharia);
        engenhariaDaComputacao.includeDisciplines(bd);
        cienciaDaComputacao.includeDisciplines(bd);
        ads.includeDisciplines(bd);
        gestao.includeDisciplines(bd);

        ///includes Graduação
        listaDeGraduacao.add(engenhariaDaComputacao);
        listaDeGraduacao.add(cienciaDaComputacao);
        listaDeGraduacao.add(ads);
        listaDeGraduacao.add(gestao);
        listaDePosGraduacao.add(banco);
        listaDePosGraduacao.add(data);

        while (true) {
            System.out.print("Digite qualquer tecla para iniciar (ou 'sair' para encerrar): \n");
            System.out.print("Olá bem vindo ao Portal de Matricula): ");
            String inicio = ler.nextLine();
            if (inicio.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite seu nome: ");
            String nome = ler.next();

            System.out.print("Digite seu cpf: ");
            String cpf = ler.next();

            System.out.print("Digite sua idade: ");
            int idade = ler.nextInt();

            System.out.print("Digite seu telefone: ");
            String telefone = ler.next();

            System.out.print("Digite seu email: ");
            String email = ler.next();

            System.out.println("Selecione em qual graduação você quer se matricular");
            System.out.println("""
                    1. Graduação
                    2. Pós-Graduação
                    """);
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    listaDeGraduacao.stream()
                            .forEach(course -> System.out.println(course.getCode() + " - " + course.getName()));
                    break;
                case 2:
                    listaDePosGraduacao.stream()
                            .forEach(course -> System.out.println(course.getCode() + " - " + course.getName()));
                    break;
                default:
                    System.out.println("Opção inválida. Digite 1 para graduação ou 2 para pós-graduação.");
            }
            String codigoCurso = ler.next();

            Aluno aluno = new Aluno(nome, cpf, idade, codigoCurso, telefone, email);

            switch (opcao) {
                case 1:
                    Optional<Graduacao> cursoEncontrado = listaDeGraduacao.stream()
                            .filter(course -> course.getCode().equals(codigoCurso))
                            .findFirst();
                    Graduacao curso = cursoEncontrado.get();
                    curso.matricularAluno(codigoCurso, alunosDoCursoGraduacao, cursoEncontrado, aluno, alunosPorGraduacao);
                    break;
                case 2:
                    Optional<PosGraduation> cursoEncontradoPos = listaDePosGraduacao.stream()
                            .filter(course -> course.getCode().equals(codigoCurso))
                            .findFirst();
                    PosGraduation cursoPos = cursoEncontradoPos.get();
                    cursoPos.matricularAluno(codigoCurso, alunosDoCursoPosGraduacao, cursoEncontradoPos, aluno, alunosPorPosGraduacao);
                    break;
            }


        }

        //listar profs, turmas, disciplinas de turma, status
        // Limpar o buffer do scanner para evitar problemas com a próxima leitura
        ler.nextLine();
    }


}
