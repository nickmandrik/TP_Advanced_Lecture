
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.util.Pair;

public class Basket {
    
    private ArrayList<Fruit> form;
    
    public Basket(List<Fruit> fruits) {
        Iterator<Fruit> itr = fruits.iterator();
        form = new ArrayList();
        while(itr.hasNext()) {
            form.add((Fruit) itr.next());
        }
        refresh();
    }
    
    public Iterator iterator() {
        Iterator itr = form.iterator();
        return itr;
    }
    
    private void refresh() {
        ArrayList<Fruit> arr = form;
        form = new ArrayList();
        for(int i = 0; i < arr.size() / 2; i++) {
            form.add(arr.get(i));
            form.add(arr.get(arr.size() - i - 1));
        }
        if(arr.size() % 2 == 1) {
            form.add(arr.get(arr.size() / 2 + 1));
        }
    }
    
}
