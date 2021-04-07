package Lab5;

public class Form {
    private String color;

    public static int getArea(){
        return 0;
    }

    public Form() {
    }

    public Form(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Form{" +
                "color='" + color + '\'' +
                '}';
    }
}
