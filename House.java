public class House extends CompositeComponent {
    private final String material;

    public House(String material) {
        super("House (" + material + ")");
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
