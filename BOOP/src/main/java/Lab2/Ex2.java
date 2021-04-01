package Lab2;

import java.util.Scanner;

//Scrieti o metoda java care sa returneze minimul a trei numere de acelasi tip primitiv (folosind
//operatorul conditional? :). Folosind aceasta metoda, scrieti o metoda Java care returneaza
//minimul a patru numere.
public class Ex2 {

    public static void main(String[] args) {

        Ex2 obj = new Ex2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti x ");
        int x = scanner.nextInt();
        System.out.println("introduceti y");
        int y = scanner.nextInt();
        System.out.println("introduceti z");
        int z = scanner.nextInt();
        System.out.println("introduceti k");
        int k = scanner.nextInt();

        System.out.println("minimul este: " + obj.Minim(x,y,z));

        System.out.println("minim2: " + obj.Minim2(obj.Minim(x,y,z),k));
    }
    public  int Minim(int x,int y,int z){

        int minim= (x<y)?(x<z?x:z):(y<z?y:z);

        return minim;
    }
    public  int Minim2(int a, int k){

        int minim2 = a < k ? a : k;
        return minim2;
    }
}
