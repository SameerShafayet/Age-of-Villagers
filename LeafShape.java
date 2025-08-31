public class LeafShape implements Component {
    private final Shape shape;

    public LeafShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + shape.describe());
    }
}
