import java.util.Scanner;
public class Task7{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    int []array=new int[10];
    for(int index=0;index<array.length;index++){
      System.out.println("Please enter a number");
      array[index]=sc.nextInt();
    }
    System.out.println("Please enter a  index");
    int  a=sc.nextInt();
    for(int i=0;i<array[a];i++){
      System.out.print("*");
    }
  }
}