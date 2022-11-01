package Abstraction;

public class Linux extends Dell {
    public int calculator(int a, int b) {
        return a+b;
    }
    public void notepad(String s) {
        System.out.println(s);
        System.out.println("1.save");
        System.out.println("2.edit");
    }
}
