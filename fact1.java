import java.util.Scanner;
public class fact1{
  public static void main(String[] arg){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the integer");
    int a=s.nextInt();
    System.out.print(a);
    
    int count=0;
    for (int i=1; i<=a; i++){
      if (a%i==0){
        System.out.println(i);
      count++;
      }
    }
    System.out.print ("Total:" + " "+count);
  }
}
    