package flower;

public class Leaf implements Component {
    public String name;
    public int calories;

    public Leaf(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void show() {
        System.out.println(name);
    }

    @Override
    public int getCal() {
        return calories;
    }

    @Override
    public void sort() {

    }
}
