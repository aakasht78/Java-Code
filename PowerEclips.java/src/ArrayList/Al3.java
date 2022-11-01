// Wap To Add Search Remove
package ArrayList;

import java.util.ArrayList;

public class Al3 {
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        
        System.out.println(fruits);
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
    }
}
