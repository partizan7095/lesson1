package flower;

import java.util.*;

public class Composite implements Component {
    private List<Component> salat = new ArrayList<>();

    public void showCat(int calMin, int calMax){
        for (Component component : salat){
            if(component.getCal() >= calMin && component.getCal() <= calMax){
                component.show();
            }
        }
    }

    public void add(Component... component) {
        salat.addAll(Arrays.asList(component));
    }

    @Override
    public void show() {
        for (Component component : salat) {
            component.show();
        }
    }

    @Override
    public int getCal() {
        int i = 0;
        for (Component component : salat) {
            i += component.getCal();
        }
        return i;
    }

    @Override
    public void sort() {
        Collections.sort(salat, new Comparator<Component>() {
            @Override
            public int compare(Component o1, Component o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Component component : salat){
            component.show();
        }
        }

    @Override
    public String getName() {
        String s = "";
        for (Component component : salat) {
            s += component.getName() + " ";
        }
        return s;
    }

}
