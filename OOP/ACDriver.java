public class ACDriver {
    public static void main(String[] args) {
        AC a1 = new AC();
        // System.out.println(a1);

        a1.price = 55000.00;
        a1.wt = "150KG";
        a1.maxtemp = 65;
        a1.mintemp = -1;
        a1.currenttemp = 16;
        a1.counsumption = 55.00;
        a1.size = "190cm";

        



        a1.MaxTemp(a1.maxtemp);
        a1.MinTemp(a1.mintemp);
        a1.CurrentTemp(a1.currenttemp);
        a1.counsumption(a1.counsumption);

        a1.Display();

    }
}
