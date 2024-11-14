package br.com.fapa.entityUniversity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PosGraduation extends Curso implements Matricula {
    private int semestres;
    private List<Disciplina> disciplinas;
    private List<Aluno> listaDeAlunos;

    public PosGraduation(String name, String code, int semestres, List<Disciplina> disciplinas ) {
        super(name, code);
        this.semestres = semestres;
        this.disciplinas = disciplinas;
    }


    public PosGraduation() {
        super();
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

    @Override
    public void generateRegistrationNumber() {

    }
}
