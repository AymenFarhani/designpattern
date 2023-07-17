package composite_dp;

public abstract  class Component {
    protected String name;
    protected int level;
    abstract void operation();
    public Component(String name) {
        this.name = name;
    }
}
