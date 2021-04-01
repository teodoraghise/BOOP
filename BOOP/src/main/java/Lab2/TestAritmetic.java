package Lab2;

//Scrieti o clasa TestAritmetic care genereaza doua numere aleatoare intregi si afiseaza la consola:
// cele doua numere, suma/ diferenta celor doua numere, inmultirea, impartirea intrega, restul
// impartirii celor doua numere

import java.util.Random;

public class TestAritmetic {

    public static void main(String[] args)
    {
        Random rand = new Random();

        int numar1 =rand.nextInt(1000);
        int numar2 =rand.nextInt(1000);
        double numar12 =rand.nextDouble();
        double numar22 =rand.nextDouble();
        System.out.println("Primul numar este: " + numar1);
        System.out.println("Al doilea numar este: " + numar2);
        System.out.println("\nSuma numerelor este: " + Suma(numar1,numar2));
        System.out.println("Diferenta numerelor este: " + Diferenta(numar1,numar2));
        System.out.println("Inmultire numerelor este: " + Imnultire(numar1,numar2));
        System.out.println("Impartire numerelor este: " + Impartire(numar1,numar2));
        System.out.println("Rest numerelor este: " + numar12 % numar22);
    }


    public static int Suma(int numar1, int numar2){
        return numar1 + numar2;
    }
    public static int Diferenta(int numar1, int numar2){
        return numar1 - numar2;
    }
    public static int Imnultire(int numar1, int numar2){
        return numar1 * numar2;
    }
    public static int Impartire(int numar1, int numar2){
        return numar1 / numar2;
    }

}
