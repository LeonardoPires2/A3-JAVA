import br.com.fapa.entityUniversity.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        ///Listas
        boolean graduacao = false;
        List<Disciplina> listaDisciplinasGraduacao = new ArrayList<>();
        List<Disciplina> listaDisciplinasDePosGraduacao = new ArrayList<>();
        List<Turma> listaDeTurmasGraduacao = new ArrayList<>();
        List<Turma> listaDeTurmasPos = new ArrayList<>();
        List<Graduacao> listaDeCursosGraduacao = new ArrayList<>();
        List<PosGraduation> listaDeCursosDePos = new ArrayList<>();
        List<Aluno> alunosDoCursoGraduacao = new ArrayList<>();
        List<Aluno> alunosDoCursoPosGraduacao = new ArrayList<>();

        ///Map
        Map<Graduacao, List<Aluno>> alunosPorGraduacao = new HashMap<>();
        Map<PosGraduation, List<Aluno>> alunosPorPosGraduacao = new HashMap<>();
        Scanner ler = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Leandro", "850204500", 20, "12", "51302303232", "leandro.carvalho@gmail.com");
        Aluno aluno2 = new Aluno("Brenda", "850204500", 24, "12", "51302303232", "brenda..");
        Aluno aluno3 = new Aluno("Monique", "850204500", 24, "12", "51302303232", "monique@..");
        Aluno aluno4 = new Aluno("Renato", "850204500", 24, "12", "51302303232", "renato@gmail.com");
        Aluno aluno5 = new Aluno("Faustinho", "850204500", 24, "12", "51302303232", "faustinho@gmail.com");
        Aluno aluno6 = new Aluno("Rodrigo Faro", "850204500", 24, "12", "51302303232", "faustinho@gmail.com");

        Disciplina bd = new Disciplina("Banco de dados");
        Disciplina engenharia = new Disciplina("Engenharia de software");
        Disciplina devWeb = new Disciplina("Desenvolvimento Web");
        Disciplina computacao = new Disciplina("Computação Gráfica");
        Disciplina matematica = new Disciplina("Algebra Booleana");
        Disciplina redes = new Disciplina("Redes II");

        Graduacao engenhariaDaComputacao = new Graduacao("Engenharia da Computação", "10", 8, listaDisciplinasGraduacao, alunosPorGraduacao);
        Graduacao cienciaDaComputacao = new Graduacao("Ciência da Computação", "11", 4, listaDisciplinasGraduacao, alunosPorGraduacao);
        Graduacao ads = new Graduacao("Análise e Desenvolvimento de Sistemas", "12", 5, listaDisciplinasGraduacao, alunosPorGraduacao);
        Graduacao gestao = new Graduacao("Gestão TI", "13", 5, listaDisciplinasGraduacao, alunosPorGraduacao);
        PosGraduation banco = new PosGraduation("Banco de dados", "14", 2, listaDisciplinasDePosGraduacao, alunosPorPosGraduacao);
        PosGraduation data = new PosGraduation("Ciência de dados", "15", 1, listaDisciplinasDePosGraduacao, alunosPorPosGraduacao);


        alunosDoCursoGraduacao.add(aluno1);
        alunosDoCursoGraduacao.add(aluno2);
        alunosDoCursoPosGraduacao.add(aluno3);
        alunosDoCursoPosGraduacao.add(aluno6);
        alunosDoCursoPosGraduacao.add(aluno4);
        alunosDoCursoPosGraduacao.add(aluno5);
        alunosPorGraduacao.put(engenhariaDaComputacao, alunosDoCursoGraduacao);

        ///includes disciplinas
        listaDisciplinasGraduacao.add(engenharia);
        listaDisciplinasGraduacao.add(devWeb);
        listaDisciplinasGraduacao.add(computacao);
        listaDisciplinasDePosGraduacao.add(bd);
        listaDisciplinasDePosGraduacao.add(engenharia);
        listaDisciplinasDePosGraduacao.add(matematica);
        listaDisciplinasDePosGraduacao.add(matematica);
        listaDisciplinasDePosGraduacao.add(redes);

        ///includes Graduação
        listaDeCursosGraduacao.add(engenhariaDaComputacao);
        listaDeCursosGraduacao.add(cienciaDaComputacao);
        listaDeCursosGraduacao.add(ads);
        listaDeCursosGraduacao.add(gestao);
        listaDeCursosDePos.add(banco);
        listaDeCursosDePos.add(data);

        Professor professor1 = new Professor("Anderson", "850204500", 24, listaDisciplinasGraduacao, listaDeTurmasGraduacao);
        Professor professor2 = new Professor("Rodrigo", "850204500", 24, listaDisciplinasGraduacao, listaDeTurmasGraduacao);
        Professor professor3 = new Professor("Paulo Silveira", "850204500", 24, listaDisciplinasGraduacao, listaDeTurmasGraduacao);
        Professor professor4 = new Professor("Silvio", "850204500", 24, listaDisciplinasGraduacao, listaDeTurmasGraduacao);


        while (true) {
            System.out.println("Digite qualquer tecla para iniciar (ou 'sair' para encerrar):");
            String inicio = ler.nextLine();

            if (inicio.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Olá bem vindo ao Portal de Matricula! Responda o formulário abaixo para completar fazer sua matricula)");


            System.out.println("Digite seu nome: ");
            String nome = ler.next();

            System.out.println("Digite seu cpf: ");
            String cpf = ler.next();

            System.out.println("Digite sua idade: ");
            int idade = ler.nextInt();

            System.out.println("Digite seu telefone: ");
            String telefone = ler.next();

            System.out.println("Digite seu email: ");
            String email = ler.next();

            System.out.println("Selecione em qual graduação você quer se matricular");
            System.out.printf("""
                    1. Graduação
                    2. Pós-Graduação
                    """);
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    listaDeCursosGraduacao.stream()
                            .forEach(course -> System.out.println(course.getCode() + " - " + course.getName()));
                    break;
                case 2:
                    listaDeCursosDePos.stream()
                            .forEach(course -> System.out.println(course.getCode() + " - " + course.getName()));
                    break;
                default:
                    System.out.println("Opção inválida. Digite 1 para graduação ou 2 para pós-graduação.");
            }

            String codigoCurso = ler.next();

            Aluno aluno = new Aluno(nome, cpf, idade, codigoCurso, telefone, email);

            switch (opcao) {
                case 1:
                    graduacao = true;
                    Optional<Graduacao> cursoEncontrado = listaDeCursosGraduacao.stream()
                            .filter(course -> course.getCode().equals(codigoCurso))
                            .findFirst();
                    Graduacao curso = cursoEncontrado.get();
                    curso.matricularAluno(codigoCurso, alunosDoCursoGraduacao, cursoEncontrado, aluno, alunosPorGraduacao);
                    Turma turma = new Turma(alunosDoCursoGraduacao, listaDisciplinasGraduacao.get(1), professor1);
                    listaDeTurmasGraduacao.add(turma);
                    Turma turma1 = new Turma(alunosDoCursoGraduacao, listaDisciplinasGraduacao.get(0), professor2);
                    listaDeTurmasGraduacao.add(turma1);
                    break;
                case 2:
                    Optional<PosGraduation> cursoEncontradoPos = listaDeCursosDePos.stream()
                            .filter(course -> course.getCode().equals(codigoCurso))
                            .findFirst();
                    PosGraduation cursoPos = cursoEncontradoPos.get();
                    cursoPos.matricularAluno(codigoCurso, alunosDoCursoPosGraduacao, cursoEncontradoPos, aluno, alunosPorPosGraduacao);
                    Turma turmaPos = new Turma(alunosDoCursoPosGraduacao, listaDisciplinasDePosGraduacao.get(1), professor3);
                    Turma turmaPos1 = new Turma(alunosDoCursoPosGraduacao, listaDisciplinasDePosGraduacao.get(0), professor4);
                    listaDeTurmasPos.add(turmaPos);
                    listaDeTurmasPos.add(turmaPos1);
                    break;
                default:
                    System.out.println("Selecione uma opção válida");
            }

            int selecao = 0;
            int variavelDeSaida = 9;

            while (selecao != variavelDeSaida) {
                System.out.printf("Seja muito bem-vindo %s em nossa universidade! Esperamos que tenha uma ótima experiência nos estudos \n", aluno.getNome());
                System.out.println("""
                        Selecione as opções abaixo para saber informações sobre seu período acadêmico
                        1. Turmas 🏛️ 
                        2. Grade Curricular 📱
                        3. Professor 🧑‍🏫
                        4. Disciplinas deste semestre 📘
                        5. Listar Colegas de Classe 📚       
                        6. Suas Informações 💾           
                        7. Editar Matricula 📖        
                        8. Excluir Matricula ❌       
                        9. Sair 🏃‍➡️        
                        """);

                selecao = ler.nextInt();
                AtomicInteger finalSelecao = new AtomicInteger(selecao);
                variavelDeSaida = 9;

                switch (selecao) {
                    case 1:
                        if (graduacao) {
                            listaDeTurmasGraduacao.stream().forEach(System.out::println);
                        } else {
                            listaDeTurmasPos.stream().forEach(System.out::println);
                        }
                        break;
                    case 2:
                        if (graduacao) {
                            listaDisciplinasGraduacao.stream().forEach(System.out::println);
                        } else {
                            listaDisciplinasDePosGraduacao.stream().forEach(System.out::println);
                        }
                        break;
                    case 3:
                        if (graduacao) {
                            listaDeTurmasGraduacao.stream()
                                    .forEach(elemento -> elemento.retornaProfessor());
                        } else {
                            listaDeTurmasPos.stream()
                                    .forEach(elemento -> elemento.retornaProfessor());
                        }
                        break;
                    case 4:
                        if (graduacao) {
                            listaDeTurmasGraduacao.stream()
                                    .forEach(elemento -> elemento.retornaDisciplina());
                        } else {
                            listaDeTurmasPos.stream()
                                    .forEach(elemento -> elemento.retornaDisciplina());
                        }
                        break;
                    case 5:
                        if (graduacao) {
                            Optional<Graduacao> primeiroCurso = listaDeCursosGraduacao.stream().findFirst();
                            if (primeiroCurso.isPresent()) {
                                primeiroCurso.get().retornaAlunosPorCurso(alunosPorGraduacao, listaDeCursosGraduacao, codigoCurso);
                            }
                        } else {
                            Optional<PosGraduation> primeiroCurso = listaDeCursosDePos.stream().findFirst();
                            if (primeiroCurso.isPresent()) {
                                primeiroCurso.get().retornaAlunosPorCurso(alunosPorPosGraduacao, listaDeCursosDePos, codigoCurso);
                            }
                        }
                        break;
                    case 6:
                        if (graduacao) {
                            alunosPorGraduacao.forEach((curso, alunos) -> {
                                System.out.println("Graduação: " + curso.getName());
                                aluno.displayInfo();
                            });
                        } else {
                            alunosPorPosGraduacao.forEach((curso, alunos) -> {
                                System.out.println("Pos Graduação: " + curso.getName());
                                aluno.displayInfo();
                            });
                        }
                        break;
                    case 7:
                        aluno.editarMatricula();
                        selecao = 0;
                        System.out.println("Cadastro editado com sucesso \n");
                        break;
                    case 8:
                        if (graduacao) {
                            int finalVariavelDeSaida = variavelDeSaida;
                            alunosPorGraduacao.forEach((curso, alunos) -> {
                                curso.excluirMatricula(alunos);
                                finalSelecao.set(curso.validacaoDeExclusao(finalSelecao.get(), finalVariavelDeSaida));
                            });
                        } else {
                            int finalVariavelDeSaida1 = variavelDeSaida;
                            alunosPorPosGraduacao.forEach((curso, alunos) -> {
                                curso.excluirMatricula(alunos);
                                finalSelecao.set(curso.validacaoDeExclusao(finalSelecao.get(), finalVariavelDeSaida1));
                            });
                        }
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Selecione uma opção válida");
                }
                if (finalSelecao.get() == variavelDeSaida) {
                    selecao = finalSelecao.get();
                }

            }
        }
    }
}
