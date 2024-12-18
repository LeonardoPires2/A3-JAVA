package br.com.fapa.entityUniversity;

import java.util.*;

public class Graduacao extends Curso {
    private int semestres;
    private List<Disciplina> disciplinas;
    public Map<Graduacao, List<Aluno>> listaDeAlunos;

    public Graduacao(String name, String code, int semestres, List<Disciplina> disciplinas, Map<Graduacao, List<Aluno>> alunos) {
        super(name, code);
        this.semestres = semestres;
        this.disciplinas = disciplinas;
        this.listaDeAlunos = alunos;
    }

    public void matricularAluno(String codigoCurso, List<Aluno> alunosDoCursoGraduacao, Optional<Graduacao> cursoEncontrado, Aluno aluno, Map<Graduacao, List<Aluno>> alunosPorGraduacao) {
        if (cursoEncontrado.isPresent()) {
            Graduacao curso = cursoEncontrado.get();
            alunosDoCursoGraduacao.add(aluno);
            alunosPorGraduacao.put(curso, alunosDoCursoGraduacao);
            System.out.println("Aluno(a) matriculado com sucesso no curso " + curso.getName());
        } else {
            System.out.println("Curso com código " + codigoCurso + " não encontrado.");
        }
    }

    public void retornaAlunosPorCurso(Map<Graduacao, List<Aluno>> alunosPorGraduacao, List<Graduacao> listaDeCursosGraduacao, String codigoCurso) {
        Optional<Graduacao> cursoEncontrado = listaDeCursosGraduacao.stream()
                .filter(course -> course.getCode().equals(codigoCurso))
                .findFirst();

        alunosPorGraduacao.forEach((curso, estudantes) -> {
            if (cursoEncontrado.isPresent() && curso.equals(cursoEncontrado.get())) {
                System.out.println("Graduação:" + curso.getName());
                for (Aluno estudante : estudantes) {
                    System.out.println("  Aluno: " + estudante.getNome());
                }
            }
        });
    }

    @Override
    public void excluirMatricula(List<Aluno> listaAlunoGraduacao) {
        System.out.println("Tem certeza que deseja excluir a matrícula? (sim/não)");
        String resposta = ler.nextLine().toLowerCase();
        while (true) {
            if (resposta.equals("sim")) {
                super.excluirMatricula(listaAlunoGraduacao);
                break;
            } else if (resposta.equals("não")) {
                break;
            } else {
                System.out.println("Resposta inválida. Digite 'sim' ou 'não'.");
                resposta = ler.nextLine().toLowerCase();
            }
        }
    }

    @Override
    public String toString() {
        return "Graduacao{" +
                "name" + getName()
                + "code" + getCode() +
                "semestres=" + semestres +
                ", disciplinas=" + disciplinas +
                '}';
    }

}
