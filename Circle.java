public class Circle implements Shape {
    private int radius;
    private String name;

    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String describe() {
        return String.format("Circle(%s: r=%d)", name, radius);
    }
}
