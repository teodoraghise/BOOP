package Lab4.P4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operatii operatii = new Operatii();

        Polinom p1 = new Polinom();
        Polinom p2 = new Polinom();
        Scanner scanner = new Scanner(System.in);

        char c = 'd';
        while (c == 'd' || c == 'D') {

            System.out.println("selectati operatia dorita");
            System.out.println("1.adunare a doua polinoame");
            System.out.println("2.scadere a doua polinoame");
            System.out.println("3.inmultire a doua polinoame");
            System.out.println("4.valoarea unui polinom intr-un punct");
            System.out.println("5.inmultirea unui polinom cu un scalar");
            System.out.println("6. Derivata unui polinom");

            int x = scanner.nextInt();
            if (x == 1 || x == 2 || x == 3) {
                System.out.println("introduceti gradul polinomului");
                int gradul = scanner.nextInt();
                p1.setGradpolinom(gradul);
                int[] coeficient = new int[gradul + 1];
                System.out.println("introduseti coeficient");
                for (int i = 0; i <= gradul; i++) {
                    coeficient[i] = scanner.nextInt();
                }
                p1.setCoeficient(coeficient);


                System.out.println("introduceti gradul celui de.al doilea polinomului");
                int grad2 = scanner.nextInt();
                p2.setGradpolinom(grad2);
                int[] coeficient2 = new int[grad2 + 1];
                System.out.println("introduseti coeficient");
                for (int i = 0; i <= gradul; i++) {
                    coeficient[i] = scanner.nextInt();
                }
                p2.setCoeficient(coeficient2);

            }
            if (x == 4 || x == 5 || x == 6) {

                System.out.println("introduceti gradul  polinomului");
                int grad1 = scanner.nextInt();
                p1.setGradpolinom(grad1);
                int[] coeficient1 = new int[grad1 + 1];
                System.out.println("introduseti coeficient");
                for (int i = 0; i <= grad1; i++) {
                    coeficient1[i] = scanner.nextInt();
                }
                p1.setCoeficient(coeficient1);


                if (x == 4) {
                    System.out.println("introduceti val in care doriti sa se calculeze polinomul");
                    int val = scanner.nextInt();
                }
                if (x == 5) {
                    System.out.println("introduceti scalar");
                    int scalar = scanner.nextInt();
                }
            }

            switch (x) {
                case 1:
                    System.out.println(Operatii.adunare(p1, p2));
                    break;
                case 2:
                    System.out.println(Operatii.scadere(p1, p2));
                    break;
                case 3:
                    System.out.println(Operatii.inmultire(p1, p2));
                    break;
//                case 4:
//                    System.out.println(Operatii.valoare(p1, val));
//                    break;
//                case 5:
//                    System.out.println(Operatii.inmultireScalar(p1, scalar));
//                    break;
                default:System.out.println(Operatii.derivare(p1));
            }

        }
    }


}
