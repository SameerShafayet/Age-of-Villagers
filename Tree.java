public class Tree extends CompositeComponent {
    private final String type;

    public Tree(String type) {
        super("Tree (" + type + ")");
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
