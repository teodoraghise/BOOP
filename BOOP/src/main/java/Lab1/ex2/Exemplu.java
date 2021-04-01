package Lab1.ex2;

public class Exemplu {
    int x;

    public Exemplu() {
    }

    public Exemplu(int x) {
        this.x = x;
    }

    public int incrementeaza(){
        return x=x+1;
    }

    @Override
    public String toString() {
        return "Exemplu{" +
                "x=" + x +
                '}';
    }
}
