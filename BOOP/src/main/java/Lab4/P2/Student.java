package Lab4.P2;

import java.util.Objects;

public class Student extends Persoana {
    private int nota;

    public Student() {
    }

    public Student(int nota) {
        this.nota = nota;
    }

    public Student(String nume, int nota) {
        super(nume);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Student: " +
               super.toString() + " " + nota ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Student )) return false;
        Student student = (Student) o;
        return student.getNume() == student.getNume();
    }

}
