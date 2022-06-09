import java.util.Scanner;
public class Task2{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    int []a=new int[10];
    for(int index=0;index<a.length;index++){
      System.out.println("Please enter a number");
      a[index]=sc.nextInt();
    }
    int max=a[0];int max_ind=0; int min=a[0];int min_ind=0;
    for(int index=1;index<a.length;index++){
      if(max<a[index]){
        max=a[index];max_ind=index;
      }
      if(min>a[index]){
        min=a[index];min_ind=index;
      }
    }
    a[max_ind]=min;
    a[min_ind]=max;
    for(int k=0;k<a.length;k++){
      System.out.print(a[k] +","); 
    }
  }
}