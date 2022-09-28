import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList a= new ArrayList<>();
        a.add("Mahabharat");
        a.add("ramayan");
        a.add("wings of fier");
        a.add("Invisible Man");
        a.add("A Passage to India");

        ArrayList b = new ArrayList<>();
        b.add("c#");
        b.add("c++");
        b.add("java");
        b.add("SQL");
        b.add("DS");


        // System.out.println(a);
        // System.out.println(b);
        
        a.addAll(b);
        a.addAll(2,b);

        System.out.println(a);


    }
}
