package Lab2;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti o valoare pt x");
        int x =scanner.nextInt();

        System.out.println("Rezultat ecuatie: "+ Ecuatie(x));
    }

    public static int Ecuatie(int x){
        int rezultat =0;
        if (x<0){
            rezultat = x *x + 4*x +4;
        }else if (x==0){
            rezultat = 0;
        }else if (x>0){
            rezultat=x*x+5*x;
        }
       return rezultat;

    }
}
