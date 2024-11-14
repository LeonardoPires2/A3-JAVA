package br.com.fapa.entityUniversity;

public class Disciplina {
    private String name;
    private String classroom;
    private int id;

    public Disciplina(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
    }

    public Disciplina() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "\n\tDisplina:'" + name + '\'' +
                "\n\tTurma:'" + classroom + '\'' +
                "\n";
    }
}
