package Object;

public class ACDriver {
	public static void main(String[] args) {
		AC a1 = new AC();
		
		a1.price = 555000.00;
		a1.wt = "160KG";
		a1.maxtemp = 56;
		a1.mintemp = -1;
		a1.currentTemp = 16;
		
//		a1.MaxTmp(a1.maxtemp);
		a1.Display();
	}
}
