import java.util.ArrayList;
import java.util.List;

public class Village implements Component {
    private final String name;
    private final List<Component> elements = new ArrayList<>();

    public Village(String name) {
        this.name = name;
    }

    public void addElement(Component c) {
        elements.add(c);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "=== Village: " + name + " ===");
        for (Component c : elements) {
            c.display(indent + "  ");
        }
    }
}
