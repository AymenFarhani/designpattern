package composite_dp;

public class ApplicationTest {
    public static void main(String[] args) {
        Composite racine = new Composite("<html>");
        Composite composite2 = new Composite("<div>");
        Composite composite3 = new Composite("</div>");
        Composite composite4 = new Composite("<div>");
        Composite composite5 = new Composite("</div>");
        racine.addComponent(composite2);
        racine.addComponent(composite3);
        racine.addComponent(composite4);
        racine.addComponent(composite5);

        racine.addComponent(new Leaf("<p>"));
        racine.addComponent(new Leaf("</p>"));
        racine.addComponent(new Leaf("<button>"));
        racine.addComponent(new Leaf("</button>"));
        composite2.addComponent(new Leaf("<p>"));
        composite2.addComponent(new Leaf("</p>"));
        composite2.addComponent(new Leaf("<span>"));
        composite2.addComponent(new Leaf("</span>"));
        composite4.addComponent(new Leaf("<p>"));
        composite4.addComponent(new Leaf("</p>"));
        composite4.addComponent(new Leaf("<span>"));
        composite4.addComponent(new Leaf("</span>"));

        Composite racine2 = new Composite("</html>");
        racine.operation();
        racine2.operation();
    }
}
