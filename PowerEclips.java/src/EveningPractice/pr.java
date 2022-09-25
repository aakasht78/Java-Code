import java.util.Scanner;
class pr{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
double [] a = new double[10];
for(int i = 0; i<a.length;i++){
a[i]= sc.nextInt();
}
for(int i = 0; i<a.length-1;i++){
  for(int j= 0; j<a.length-i-1;j++){
  if(a[j] > a[j+1]){
    double temp = a[j];
    a[j]=a[j+1];
    a[j+1] = temp;
  }
 }//end in
}//for ot
for(int i = 0;i<a[5];i++){

System.out.println(a[i]+"");
}
}
}