import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Component {
    private final String name;
    private final List<Component> children = new ArrayList<>();

    public CompositeComponent(String name) {
        this.name = name;
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name);
        for (Component c : children) {
            c.display(indent + "  ");
        }
    }
}
