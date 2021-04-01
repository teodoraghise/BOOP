package Lab3;
//4. Scrieți un program în care fiind dată o variabilă care stochează o referință către un String, determină:
//  numărul de consoane și vocale
//  indicii pentru o vocală introdusă din linia de comandă

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 obj = new Ex4();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un cuvant");
        String cuvant = scanner.nextLine();
        System.out.println("nr de vocale: " + obj.getVocale(cuvant));
        System.out.println("nr de consoane: " + obj.getConsoane(cuvant));
    }

    public int getVocale(String cuvant) {
        int nrVocale = 0;
        for (int i = 0; i < cuvant.length(); i++) {
            char litera = cuvant.charAt(i);
            if (litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u') {
                nrVocale++;
            }
        }
        return nrVocale;
    }

    public int getConsoane(String cuvant) {
        int nrConsoane = 0;
        for (int i = 0; i < cuvant.length(); i++) {
            char litera = cuvant.charAt(i);
            if (litera == 'b' || litera == 'c' || litera == 'd' || litera == 'f' || litera == 'g' || litera == 'h' || litera == 'j' ||
                    litera == 'k' || litera == 'l' || litera == 'm' || litera == 'n' || litera == 'p' || litera == 'q' || litera == 'r' || litera == 's' ||
                    litera == 't' || litera == 'v' || litera == 'w' || litera == 'x' || litera == 'y' || litera == 'z') {
                nrConsoane++;
            }
        }
        return nrConsoane;
    }
}
