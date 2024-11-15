package br.com.fapa.entityUniversity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PosGraduation extends Curso {
    private int semestres;
    private List<Disciplina> disciplinas;
    public Map<PosGraduation, List<Aluno>> listaDeAlunos;

    public PosGraduation(String name, String code, int semestres, List<Disciplina> disciplinas, Map<PosGraduation, List<Aluno>> alunos) {
        super(name, code);
        this.semestres = semestres;
        this.disciplinas = disciplinas;
        this.listaDeAlunos = alunos;
    }

    public void matricularAluno(String codigoCurso, List<Aluno> alunosDoCursoGraduacao, Optional<PosGraduation> cursoEncontrado, Aluno aluno, Map<PosGraduation, List<Aluno>> alunosPorPosGraduacao) {
        if (cursoEncontrado.isPresent()) {
            PosGraduation curso = cursoEncontrado.get();
            alunosDoCursoGraduacao.add(aluno);
            System.out.println(alunosPorPosGraduacao.get(curso));
            alunosPorPosGraduacao.put(curso, alunosDoCursoGraduacao);
            System.out.println("Aluno(a) matriculado com sucesso no curso " + curso.getName());
        } else {
            System.out.println("Curso com código " + codigoCurso + " não encontrado.");
        }
    }

    public void retornaAlunosPorCurso(Map<PosGraduation, List<Aluno>> alunosPorPosGraduacao, List<PosGraduation> listaDeCursosGraduacao, String codigoCurso) {
        Optional<PosGraduation> cursoEncontrado = listaDeCursosGraduacao.stream()
                .filter(course -> course.getCode().equals(codigoCurso))
                .findFirst();

        alunosPorPosGraduacao.forEach((curso, estudantes) -> {
            if (cursoEncontrado.isPresent() && curso.equals(cursoEncontrado.get())) {
                System.out.println("Pós-Graduação:" + curso.getName());
                for (Aluno estudante : estudantes) {
                    System.out.println("  Aluno: " + estudante.getNome());
                }
            }
        });
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

    @Override
    public void excluirMatricula(List<Aluno> listaAlunoGraduacao) {
        super.excluirMatricula(listaAlunoGraduacao);
    }
}
