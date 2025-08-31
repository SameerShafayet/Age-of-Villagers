public class Triangle implements Shape {
    private int base, height;
    private String name;

    public Triangle(int base, int height, String name) {
        this.base = base;
        this.height = height;
        this.name = name;
    }

    @Override
    public String describe() {
        return String.format("Triangle(%s: base=%d height=%d)", name, base, height);
    }
}
