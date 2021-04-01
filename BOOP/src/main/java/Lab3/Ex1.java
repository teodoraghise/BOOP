package Lab3;

import java.util.Scanner;

//Scrieti un program java care citeste de la din consola un numar de secunde si intoarce numarul maxim de ore, de
//minute, de secunde care este echivalent cu numarul initial de secunde.
//Exemplu: 7384 secunde este echivalent cu 2 ore, 3 minute si 4 secunde.
public class Ex1 {

    public static void main(String[] args) {
        Ex1 obj = new Ex1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti secunde :");
        int secunde = scanner.nextInt();

        System.out.println( obj.Ore(secunde) +"h:" + obj.Minute(secunde) +"m:"+ obj.Secunde(secunde)+"s");
    }


    public int Ore(int secunde){
        int h = secunde/3600;
        return h;
    }

    public int Minute(int secunde){
        int m = (secunde - Ore(secunde)*3600)/60;
        return m;
    }

    public int Secunde( int secunde){
        int s = secunde - Ore(secunde)*3600 - Minute(secunde)*60;
        return s;
    }

}
