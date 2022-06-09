import java.util.Scanner;
public class Tester{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    Patient p1=new Patient("ayesha",20,"B+","ser01");
    WRM w1=new WRM();
    w1.RegisterPatient(p1);
    w1.ShowAllPatient();
    Patient p3=new Patient("skaib",20,"B+","ser054");
    Patient p2=new Patient("tonmoy",20,"B+","ser41");
    w1.RegisterPatient(p3);
    w1.RegisterPatient(p2);
    w1.ShowAllPatient();
    
  }
}