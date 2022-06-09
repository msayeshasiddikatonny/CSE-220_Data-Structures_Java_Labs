import java.util.Scanner;
public class Task11{
  public static boolean allDigitsOdd(int n){
    int i;int num=n;
    for(i=0;num>0;i++){
      num=num/10;
    }
    
    for(int k=1;k<=i;k++){
      int  newNum=n%10;
      if(newNum==1||newNum==3 ||newNum==5 ||newNum==7 ||newNum==9){
      }
      else{
        return false;
      }
    }
    return true;
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int num=sc.nextInt();
    System.out.println(allDigitsOdd(num));
  }

}