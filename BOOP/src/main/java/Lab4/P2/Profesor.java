package Lab4.P2;

public class Profesor extends Persoana{
    private String materie;

    public Profesor() {
    }

    public Profesor(String materie) {
        this.materie = materie;
    }

    public Profesor(String nume, String materie) {
        super(nume);
        this.materie = materie;
    }

    @Override
    public String toString() {
        return "Profesor: "+
                super.toString()+ " " + materie;
    }
}
