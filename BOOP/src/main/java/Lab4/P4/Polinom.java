package Lab4.P4;

import java.util.Arrays;


@SuppressWarnings("ALL")
public class Polinom {

    private int gradpolinom;
    private int[] coeficient;


    public Polinom(int gradpolinom, int[] coeficient) {
        this.gradpolinom = gradpolinom;
        this.coeficient = coeficient;
    }
    public Polinom() {
    }

    public int getGradpolinom() {
        return gradpolinom;
    }

    public void setGradpolinom(int gradpolinom) {
        this.gradpolinom = gradpolinom;
    }

    public int[] getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(int[] coeficient) {
        this.coeficient = coeficient;
    }

    @Override
    public String toString() {
   String rezult = "polinom gradpolinom= " + gradpolinom + " coeficient= ";

   for(int i =gradpolinom; i >= 0; i--){
       if(i==gradpolinom){
           rezult += coeficient[i] +"*x^" +i;
       } else rezult += ( coeficient[i] > 0 ? "+" : "" ) + coeficient[i] + "*x^" + i;
   }
   return rezult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
       if(o == null)
           return false;
       if(getClass() != o.getClass())
           return false;
       Polinom polinom = (Polinom)o;
       if(!Arrays.equals(coeficient,polinom.coeficient))
           return false;
       return true;
    }


}
