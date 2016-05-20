
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    
    public static void main(String[] args) {
        
        LinkedList<Fruit> list = getFruits();
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).print() + " ");
        }
        System.out.println();
        
        Basket basket = new Basket(list);
        Iterator<Fruit> it = basket.iterator();
        
        while(it.hasNext()) {
             Fruit element = it.next();
             System.out.print(element.print() + " ");
        }
        System.out.println();
    }
    
    public static LinkedList<Fruit> getFruits() {
        Fruit apple = new Fruit("apple");
        Fruit orange = new Fruit("orange");
        Fruit bananas = new Fruit("bananas");
        
        LinkedList<Fruit> arr = new LinkedList();
        arr.add(apple);
        arr.add(orange);
        arr.add(bananas);
        arr.add(apple);
        arr.add(apple);
        arr.add(bananas);
        
        return arr;
    }
}
