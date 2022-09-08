package Practice;
public class ArmstrongWithMethod {
		public static void Armstrong(int a) {
			int num = a;
			int cube = 0;
			int rem;
			int temp = num;
			
			while(num>0) {
				rem = num%10;
				num=num/10;
				cube=cube+(rem*rem*rem);
			}
			if(temp==cube) {
				System.out.println(num + " It is an armstrong number");
			}
			else {
				System.out.println(num + " It is not an armstrong number");
			}
		}
		public static void main(String[] args) {
			Armstrong(7);
		}
}
