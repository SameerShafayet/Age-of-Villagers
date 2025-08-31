public class ComponentFactory {
    public static Shape createShape(String type, String name) {
        switch (type.toLowerCase()) {
            case "rectangle":
                return new Rectangle(1, 1, name);
            case "circle":
                return new Circle(1, name);
            case "triangle":
                return new Triangle(1, 1, name);
            default:
                throw new IllegalArgumentException("Unknown shape: " + type);
        }
    }
}
