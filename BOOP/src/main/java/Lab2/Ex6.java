package Lab2;

import java.util.Scanner;

//Sa se scrie un program Java care calculeaza n! (n!=!*2*...*n), unde 0<n<13 este un
//numar natural
public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti un numar");
        int n = scanner.nextInt();

        System.out.println("valoarea factoriala este: " + Factorial(n));
    }

    public static int Factorial(int n ){
    int rezultat =1;
        if( 0<n && n < 13){
            for(int i=1; i<=n; i++){

                 rezultat = i * rezultat;

            }
        }
    return rezultat;
    }
}
