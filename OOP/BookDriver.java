 class BookDriver {
    public static void main(String []args)
    {
        Book b1 = new Book();
        System.out.println(b1);

        b1.brand="classmate";
        b1.price=150.00;
        b1.page=260;
        b1.size="A4";
        b1.bind="Soft Bind";

        Book b2 = new Book();

        b2.brand="classmate1";
        b2.price=1150.00;
        b2.page=2660;
        b2.size="A45";
        b2.bind="Hard Bind";

        b1.Display();
        b2.Display();
      
    }
}
