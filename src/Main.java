import br.com.fapa.entityUniversity.Course;
import br.com.fapa.entityUniversity.Discipline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Discipline bd = new Discipline("Banco de dados", "BD101");
        Discipline engenharia = new Discipline("Engenharia de software", "EG202");

        Course engenhariaDaComputação = new Course("Engenharia da Computação", "10");
        Course cienciaDaComputacao = new Course("Ciência da Computação", "11");
        Course cienciaDeDados = new Course("Ciência de Dados", "12");

        engenhariaDaComputação.includeDisciplines(engenharia);
        engenhariaDaComputação.includeDisciplines(bd);
        cienciaDaComputacao.includeDisciplines(bd);

        List<Course> listCourses = new ArrayList<>();
        listCourses.add(engenhariaDaComputação);
        listCourses.add(cienciaDaComputacao);
        listCourses.add(cienciaDeDados);


       listCourses.stream()
                .forEach(course -> System.out.println(course.getCode() + " - " + course.getName()));

        Scanner ler = new Scanner(System.in);
        String code = ler.next();

        listCourses.stream().filter(course -> course.getCode().equals(code)).forEach(System.out::println);




    }
}