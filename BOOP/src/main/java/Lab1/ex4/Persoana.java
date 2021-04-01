package Lab1.ex4;

public class Persoana {
    public String nume;

    public Persoana(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
