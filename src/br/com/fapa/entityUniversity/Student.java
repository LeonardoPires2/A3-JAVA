package br.com.fapa.entityUniversity;

public class Student extends Person {
    //    private Registration idRegistration;
    private String courseId;
    private int dateOfBirth;
    private String phone;
    private String email;

    public Student(String name, String cpf, String age, String courseId, int dateOfBirth, String phone, String email) {
        super(name, cpf, age);
        this.courseId = courseId;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
        return "Student{" +
                "name='" + this.name + '\'' +
                ", courseId='" + courseId + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println("Student{" +
                "name='" + this.name + '\'' +
                ", courseId='" + courseId + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}');

    }
}
