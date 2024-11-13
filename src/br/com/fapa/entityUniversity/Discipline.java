package br.com.fapa.entityUniversity;

public class Discipline {
    private String name;
    private String classroom;
    private int id;

    public Discipline(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
    }

    public Discipline() {
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
