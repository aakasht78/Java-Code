package Object;

public class AC {
	 double price;
	 String wt;
	 int maxtemp;
	 int mintemp;
	 int currentTemp;
	 
	 
	 public void Display() {
		 System.out.println(price);
		 System.out.println(wt);
	 }
	 public void MaxTmp() {
		 if(maxtemp>55) {
			 System.out.println(maxtemp);
		 }
	 }
	 public void CurrentTemp() {
		 System.out.println(currentTemp);
	 }
}
