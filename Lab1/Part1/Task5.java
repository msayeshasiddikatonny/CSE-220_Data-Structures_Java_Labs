import java.util.Scanner;
public class Task5{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    
    int []array=new int[10];
    for(int i=0;i<15;i++){
      System.out.println("enter a number");
      int a=sc.nextInt();
      if(a>=0 && a<=9){
        if(a==0)
          array[0]++;
        if(a==1)
          array[1]++;
        if(a==2)
          array[2]++;
        if(a==3)
          array[3]++;
        if(a==4)
          array[4]++;
        if(a==5)
          array[5]++;
        if(a==6)
          array[6]++;
        if(a==7)
          array[7]++;
        if(a==8)
          array[8]++;
        if(a==9)
          array[9]++;
      }
      else
        i--;
    }
    
    for(int i=0;i<10;i++){
      System.out.println(i+" was  found "+array[i]+" times");
    }
  }
}