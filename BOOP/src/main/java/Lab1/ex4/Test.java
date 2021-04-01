package Lab1.ex4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Persoana[] pers;
        int nrPersoane=3;

        System.out.println("cate persoane vrei sa introduci?");
        nrPersoane = s.nextInt();

        pers = new Persoana[nrPersoane];

        for(int i=0; i<nrPersoane; i++){
            System.out.println("aati numer de persoane" + i+1);
            pers[i] = new Persoana(s.next());
        }

        for(int i=0; i<nrPersoane; i++){
            System.out.println("persoana " + i+1 + " este: " + pers[i].toString());
        }
    }
}
