import java.util.Scanner;
    class SumOfEvenNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Starting Number :- ");
            int Start = sc.nextInt();
            System.out.println("Enter The Ending Number :- ");
            int End = sc.nextInt();
            int sum = 0;
            for (int w=Start;w<=End;w++){
                sum = sum+w;
            }
            System.out.println("The Sum Of All Number Between " + Start + " To End " + End + " is " + sum);
        }
    }
