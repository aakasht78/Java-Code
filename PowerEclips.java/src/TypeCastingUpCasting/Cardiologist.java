package TypeCastingUpCasting;

public class Cardiologist extends Doctor{
        String Organ;
        String Specialization;
        
        Cardiologist(){}

        Cardiologist(double fees, String degree, String Organ, String Specialization){
            super(fees,degree);
            this.Organ = Organ;
            this.Specialization = Specialization;
        }
        
        public void DisplayCardiologist() {
            DisplayDoctor();
            System.out.println(Organ);
            System.out.println(Specialization);
        }
}
