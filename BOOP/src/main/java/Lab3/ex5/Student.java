package Lab3.ex5;

import java.util.Objects;

//Implementati o aplicatie java in care creați urmatoarele clasele:
//  Clasa Student cu atributele name de tip String si year de tip Integer .
//    Clasa defineste constructori, metoda toString, equals (metoda equals va compara doi studenti dupa nume si anul de studiu) si implementeaza interfata Comparable.
// Clasa Course cu atributele title de tip String, description de tip String, students - array de obiecte de tip Student.
//    In clasa Course se va defini o metoda filterYear care returneaza o listă de studenți care sunt intr-un an dat ca parametru.
//    Lista de studenti returnata va fi sortata dupa numele studentului.
// O clasa Test cu metoda main. In interiorul metodei main creati un obiect Course și mai multe obiecte de tip Student.
//    Populați obiectul Course cu obiecte de tip Student.
//    Afișați toți studenții din anul dat ca parametru ordonati dupa nume.
//    Creați două obiecte Student cu aceleași date în ele. Afișați rezultatul folosirii equals() între ele.
public class Student implements Comparable {

    public String nume;
    public int year;

    public Student(String nume, int year) {
        this.nume = nume;
        this.year = year;
    }

    public Student(Student student) {
        this.nume = student.getNume();
        this.year = student.getYear();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Student )) return false;
        Student student = (Student) o;
        return getYear() == student.getYear() &&
                getNume().equals(student.getNume());
    }

    @Override
    public int compareTo(Object o) {
        if(o.getClass().equals(this.getClass())){
            Student student = (Student) o;
            return this.nume.compareTo(student.getNume());
        }
    return 0;
    }
}

