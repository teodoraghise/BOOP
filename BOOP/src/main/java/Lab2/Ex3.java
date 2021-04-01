package Lab2;

import java.util.Scanner;

//Presupunem ca depunem o suma (depozit la temen) intr-o banca care ofera dobanda de 25% pe
//an. Sa se calculeze suma finala dupa un anumit numar de ani (se va face capitalizarea contului,
//adica se va tine cont de “dobanda la dobanda”).
public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti o suma de bani");
        double bani=scanner.nextDouble();

        System.out.println("introduceti numarul de ani pt depunere");
        int nrAni=scanner.nextInt();

        System.out.println("resultat"+ Rezultat(nrAni,bani));

    }

public static double Rezultat(int nrAni, double bani){
   int i =1;
   double rezultat = 0;
   double rezultatiFINAL=0;

   while(i<= nrAni){
       rezultat = (0.25 * bani)+bani;
               i++;
       rezultatiFINAL = rezultatiFINAL + rezultat;
       bani = rezultat;
   }
        return rezultat;
}


}
