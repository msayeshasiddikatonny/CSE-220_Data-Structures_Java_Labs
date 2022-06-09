import java.util.Scanner;
public class Task8{
  public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    
    System.out.println("please enter the size of array");
    int s=sc.nextInt();
    int A[]=new int[s];
    int B[]=new int[s];
        int C[]=new int[s];
    for(int i=0;i<s;i++){
      System.out.println("please enter a value");
      A[i]=sc.nextInt();
    }
    for(int i=0;i<s;i++){
      System.out.println("please enter a value");
      B[i]=sc.nextInt();
    }
    for(int i=0;i<s;i++){
      C[i]=5*A[i]-B[i];
    }
    for(int i=0;i<s;i++){
      System.out.print(C[i]+" ");
 
    }
  }
}