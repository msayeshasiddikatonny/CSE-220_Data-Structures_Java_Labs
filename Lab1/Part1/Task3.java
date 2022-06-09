import java.util.Scanner;
public class Task3{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int []a=new int[5];
    for(int index=0;index<a.length;index++){
      System.out.println("Please enter a number");
      a[index]=sc.nextInt();
    }
    int n=a.length;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        int temp=0;
        if(a[j]<a[j+1]){
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        } 
      }
    }
    for(int k=0;k<a.length;k++){
      System.out.print(a[k] +","); 
    }
    for(int k=0;k<a.length;k++){
      if(a[k]%2==0)
        System.out.print(a[k] +","); 
    }
  }
}
