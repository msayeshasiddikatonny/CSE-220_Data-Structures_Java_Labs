import java.util.Scanner;
public class Task1{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the length of array");
    int l=sc.nextInt();
    int []array=new int[l];
    for(int i=0;i<l;i++){
      int a=sc.nextInt();
      array[i]=a;
    }
    if(array[0]==6 || array[l-1]==6)
      System.out.println("true");
    else
      System.out.println("false");
  }
}