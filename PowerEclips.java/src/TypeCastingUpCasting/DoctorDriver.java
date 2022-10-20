package TypeCastingUpCasting;

public class DoctorDriver {
    public static void main(String[] args) {
        Cardiologist c1 = new Cardiologist(200.00,"MBBS","Heart", "MD");
//       c1.DisplayCardiologist();
       System.out.println("=====UpCasting==========");
//       c1.DisplayDoctor(); 
       
       Doctor d = c1;//upcasting
       
       d.DisplayDoctor();
      System.out.println("+======DownCasting=======");
       Cardiologist c2=(Cardiologist) c1;//DownCasting
       
       c2.DisplayCardiologist();
       c2.DisplayDoctor();
       
           
    }
}
