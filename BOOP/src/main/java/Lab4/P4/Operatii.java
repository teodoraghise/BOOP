package Lab4.P4;

public class Operatii {

    public static Polinom adunare(Polinom p1, Polinom p2){
        int grad = max(p1.getGradpolinom(), p2.getGradpolinom());
        int[] coef = new  int[grad +1];
        if(p1.getGradpolinom()>p2.getGradpolinom()){
            for(int i=0;i<p1.getGradpolinom();i++){
                if(i<=p2.getGradpolinom()){
                    coef[i]=p1.getCoeficient()[i]+p2.getCoeficient()[i];

                    }else{
                    coef[i]=p1.getCoeficient()[i];
                }
            }
        }else{

        }for (int i=0;i<p2.getGradpolinom();i++){
            if(i<=p1.getGradpolinom()){
                coef[i]=p1.getCoeficient()[i]+p2.getCoeficient()[i];
            }else {
                coef[i]=p2.getCoeficient()[i];
            }
        }
        return new Polinom(grad,coef);
    }
    public static Polinom scadere(Polinom p1, Polinom p2){
        int grad  = max(p1.getGradpolinom(),p2.getGradpolinom());
        int[] coef= new int[grad+1];
        if(p1.getGradpolinom()>=p2.getGradpolinom()){
             for(int i=0;i<=p1.getGradpolinom();i++){
                 if(i<p2.getGradpolinom()){
                     coef[i]=p1.getCoeficient()[i]-p2.getCoeficient()[i];
                 }else {
                     coef[i]=p1.getCoeficient()[i];
                 }
             }
        }else {
            for (int i=0; i<p2.getGradpolinom();i++){
                if(i<p1.getGradpolinom()){
                    coef[i]=p2.getCoeficient()[i]-p2.getCoeficient()[i];
                }else {
                    coef[i]=p2.getCoeficient()[i];
                }
            }
        }
        return new Polinom(grad,coef);
    }

    public static Polinom inmultire(Polinom p1, Polinom p2) {
        int grad = p1.getGradpolinom() + p2.getGradpolinom();
        int[] coef = new int[grad + 1];
        for (int i = 0; i <= p1.getGradpolinom(); i++) {
            for (int j = 0; i <= p2.getGradpolinom(); i++) {

                coef[i + j] = p1.getCoeficient()[i] * p2.getCoeficient()[j];
            }
        }
        return new Polinom(grad, coef);
    }

    public static Polinom inmultireScalar(Polinom p1, int a) {
        int[] coef = new int[p1.getGradpolinom() + 1];
        for (int i = 0; i <= p1.getGradpolinom(); i++) {
                coef[i] = p1.getCoeficient()[i] * a;

        }
        p1.setCoeficient(coef);
        return p1;
    }
public static int valoare(Polinom p, int x){
        int rezultat = 0;
        for(int i=0;i<=p.getGradpolinom();i++){
            rezultat += p.getCoeficient()[i]*Math.pow(x,i);
        }
        return rezultat;
}
    public static Polinom derivare(Polinom p1) {
        int grad = p1.getGradpolinom()-1;
        int[] coef = new int[p1.getGradpolinom()];
        for (int i = 1; i <= p1.getGradpolinom(); i++) {
            coef[i-1] = p1.getCoeficient()[i] * i;

        }
        return new Polinom(grad,coef);
    }

    public static  int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
}

