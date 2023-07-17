package composite_dp;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> components = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }
    @Override
    void operation() {
        String spaces = "";
        for (int i = 0; i < level; i++) {
            spaces += "   ";
        }
        System.out.println(spaces + name);
        for (Component component : components) {
            component.operation();
        }
    }

    public void addComponent(Component component) {
        component.level = this.level + 1;
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }
}
