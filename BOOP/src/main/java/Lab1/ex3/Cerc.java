package Lab1.ex3;

import java.util.Objects;

public class Cerc {
    public double raza;
    public double diametru;

    public Cerc() {
    }

    public Cerc(double raza, double diametru) {
        this.raza = raza;
        this.diametru = diametru;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double getDiametru() {
        return diametru;
    }

    public void setDiametru(double diametru) {
        this.diametru = diametru;
    }

    public double arie(){
        return 3.14*raza*raza;
    }
    public double diametru(){
        return 2*3.14*raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Cerc )) return false;
        Cerc cerc = (Cerc) o;
        return Double.compare(cerc.raza, raza) == 0 &&
                Double.compare(cerc.diametru, diametru) == 0;
    }



    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                ", diametru=" + diametru +
                '}';
    }
}
