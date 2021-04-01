package Lab1.ex2;

//Scrieti un program alcatuit din doua clase: clasa Exemplu si clasa Instantiere.
// Clasa Exemplu declara un atribut x de tip int, doi constructori (unul cu argument si unul default),
// o metoda care incrementeaza valoarea lui x cu 1, si o metoda toString().
// Clasa Instantiere instatiaza doua obiecte de tipul Exemplu, apeleaza metoda de incrementare
// pe cele doua obiecte si metoda toString() atat inainte cat si dupa incrementare.

public class Instantiere {

    public static void main(String[] args) {
        Exemplu exemplu = new Exemplu();
        Exemplu exemplu2 = new Exemplu(5);


        System.out.println(exemplu.toString());
        exemplu.incrementeaza();
        System.out.println(exemplu.toString());

        System.out.println("----------");

        System.out.println(exemplu2.toString());
        exemplu2.incrementeaza();
        System.out.println(exemplu2.toString());

       // System.out.println(exemplu.incrementeaza());
        //System.out.println(exemplu2.incrementeaza());
    }
}
