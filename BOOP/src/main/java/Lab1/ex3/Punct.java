package Lab1.ex3;

import java.util.Objects;

public class Punct {

    public String culoare;
    public int dimensiune;

    public Punct() {
    }

    public Punct(String culoare, int dimensiune){
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( o instanceof Punct )) return false;
        Punct punct = (Punct) o;
        return getDimensiune() == punct.getDimensiune() &&
                Objects.equals(getCuloare(), punct.getCuloare());
    }

    @Override
    public String toString() {
        return "Punct{" +
                "culoare='" + culoare + '\'' +
                ", dimensiune=" + dimensiune +
                '}';
    }
}
