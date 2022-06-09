import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x,n=sc.nextInt();
    int a[]=new int[n];
    try{
      a[5]=99;
      x=n/0;
    }
    
    
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array does not have this index");
    }
    catch(ArithmeticException e){
      System.out.println("division by zero");
    }
    finally{
      System.out.println("THE END");
      
    }
  }
}
