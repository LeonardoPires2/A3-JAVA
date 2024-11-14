package br.com.fapa.entityUniversity;

public class Aluno extends Pessoa {
    private Matricula idMatricula;
    private String courseId;
    private String phone;
    private String email;

    public Aluno(String name, String cpf, int idade, String courseId, String phone, String email) {
        super(name, cpf, idade);
        this.courseId = courseId;
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + this.nome + '\'' +
                ", courseId='" + courseId + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println("Aluno{" +
                "name='" + this.nome + '\'' +
                ", courseId='" + courseId + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}');

    }
}
