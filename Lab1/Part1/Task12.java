import java.util.Scanner;
public class Task12{
  public static boolean method(int m1,int d1,int m2,int d2){
    if (m1<m2){
      return true;
    }
    else{
      if(d1<d2)
        return true;
      else 
        return false;
    }
  }
  public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    
    System.out.println("please enter the date");
    
    int month1=sc.nextInt();
    int day1=sc.nextInt();
    int month2=sc.nextInt();
    int day2=sc.nextInt();
    if(month1>0 && month1<13 && day1>0 && day1 <32 && month1>0 && month1<13 && day1>0 && day1 <32)
      System.out.println(method(month1,day1,month2,day2));
  }
}