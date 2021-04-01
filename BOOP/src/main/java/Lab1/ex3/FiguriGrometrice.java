package Lab1.ex3;

public class FiguriGrometrice {
    public static void main(String[] args) {

        Cerc cerc = new Cerc();
        Punct punct = new Punct();

        System.out.println(cerc.toString());
        cerc.arie();
      cerc.toString();
      cerc.setDiametru(3.3);
      cerc.setRaza(3.4);
     // cerc.equals(3);
        System.out.println(cerc.toString());
        System.out.println("aria este: " + cerc.arie());
        System.out.println("perimetrul este: " + cerc.diametru());
        System.out.println("equals " + cerc.equals(3.3));


        punct.setCuloare("alb");
        punct.setDimensiune(3);
        System.out.println(punct.toString());
        System.out.println(punct.equals("alb"));
    }
}
