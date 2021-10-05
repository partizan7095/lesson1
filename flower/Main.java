package flower;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Leaf tomato = new Leaf("tomato", 12);
        Leaf cucumber = new Leaf("cucumber", 10);
        Leaf pepper = new Leaf("pepper", 8);
        Leaf carrot = new Leaf("carrot", 6);

        Composite salat = new Composite();

        salat.add(tomato, pepper, cucumber, carrot);

        salat.show();
        salat.showCat(7,11);
        System.out.println(salat.getCal());
        salat.sort();

    }

}
