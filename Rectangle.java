public class Rectangle implements Shape {
    private int width, height;
    private String name;

    public Rectangle(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    public String describe() {
        return String.format("Rectangle(%s: %dx%d)", name, width, height);
    }
}
