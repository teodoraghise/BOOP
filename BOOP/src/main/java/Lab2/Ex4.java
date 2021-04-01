package Lab2;

//Scrieti o clasa Java care genereaza numere pseudoaleatoare din domeniul 0.....65535.
//        Presupunand ca avem o valoare initiala r0 pentru generarea urmatorului numar aleator din
//        domeniu 0....65535 utilizam formula rnou = ((rvechi*25173) + 13849) % 65536.
public class Ex4 {
    public static void main(String[] args) {

       // Ex4 ex4 = new Ex4();
        int nr = Random(0,4);
        System.out.println("wwww "+ nr);
    }


public static int Random (int min, int max){
        int range = (max- min)+1;
        return (int)(Math.random()*range);
}

}
