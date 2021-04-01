package Lab3.ex5;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("studenti si an ");

        String[] nume = new String[3];
        int[] an = new int[3];

        for(int i=0; i<nume.length; i++){
            for(int j=0; i<an.length; i++){
            System.out.println("nume");
            nume[i]= scanner.nextLine();
                scanner.nextLine();
                System.out.println("an");
                an[j]= scanner.nextInt();
            }
        }


    }

}
