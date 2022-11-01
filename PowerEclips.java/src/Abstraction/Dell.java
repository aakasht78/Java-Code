package Abstraction;

public abstract class Dell {
    public void welcome(String name) {
        System.out.println("Welcome To Dell " +name);
    }
    
    public abstract int calculator(int a, int b);
    
    public abstract void notepad(String type);
}
