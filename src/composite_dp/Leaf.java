package composite_dp;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }
    @Override
    void operation() {
        String spaces = "";
        for (int i = 0; i < level; i++) {
            spaces += "   ";
        }
        System.out.println(spaces + name);
    }
}
