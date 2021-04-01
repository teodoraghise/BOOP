package Lab3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Ex2 obj = new Ex2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a");
        int a = scanner.nextInt();
        System.out.println("Introduceti b");
        int b = scanner.nextInt();

        System.out.println("cmmmc: "+ obj.Cmmdc(a,b));
        System.out.println("cmmdc: " + obj.Cmmmc(a,b));

    }

    public int Cmmdc(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public int Cmmmc(int a, int b){
        return a*b/Cmmdc(a,b);
    }
}
