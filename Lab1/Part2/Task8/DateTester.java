import java.util.Scanner;
public class DateTester{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    Date d=new Date(9,20,1998);
    System.out.println(d.getMonth()+"/"+d.getDay()+"/"+d.getYear());
  }
}