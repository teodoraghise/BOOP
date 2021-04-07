package Lab5;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
    }


    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }

    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
