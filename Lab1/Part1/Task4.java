 import java.util.Scanner;
public class Task4{
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int []a=new int[10];System.out.println("Please enter a number");
      a[0]=sc.nextInt();
    for(int i=1;i<a.length;i++){
      System.out.println("Please enter a number");
      int r=sc.nextInt();
       int flag=0;
       for(int k=1;k<=i;k++){
         if (r==a[k-1]){
           System.out.println(r+" is already in among the number");
           flag=1;
         }
         else{
           a[i]=r;
         }
       }
       if(flag==1){
         System.out.println("Please enter another number");
         i--;
       }
    }
     
  }
}
