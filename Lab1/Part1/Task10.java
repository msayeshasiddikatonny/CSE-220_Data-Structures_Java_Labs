import java.util.Scanner;
public class Task10{
  public static String season(int m,int d){
    if(m==12 && d>=16 || m==3 && d<=15 || m<3  ){
      return "Winter";
    }
    else{
      if(m==3 && d>=16 || m==6 && d<=15 || m<6  ){
        return "Spring";
      }
      else{
        if(m==6 && d>=16 || m==9 && d<=15 || m<9  ){
          return "Summer";
        }
        
        else{
          return "Fall";
        }
      }
    }
  }
  public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    
    System.out.println("please enter the date");
    
    int month=sc.nextInt();
    int day=sc.nextInt();
    if(month>0 && month<13 && day>0 && day <32)
    System.out.println(season(month,day));
  }
}