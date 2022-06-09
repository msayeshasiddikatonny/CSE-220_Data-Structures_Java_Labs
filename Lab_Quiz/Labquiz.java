import java.util.Scanner;
public class Labquiz{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int []a=new int[10];
    int []b=new int[10];
    int j=0,m=0,flag=0;
    System.out.println("Please enter a number");
    a[0]=sc.nextInt();
    for(int i=1 ;i<a.length  ;i++){
      System.out.println("Please enter a number");
      int r=sc.nextInt();
      
      for(int k=1;k<=i;k++){
        if (r==a[k-1]){
          if(j<10){
            b[j]=r;
            j++;
            i--;
          }
          else{
            System.out.println("Way too Many duplicates"); 
            flag=1;
            break;
          }
        }
        else{
          a[i]=r;
        }
      }
    }
    if(flag==0){
      for( int i=0;i<a.length;i++){
        if(a[i]%2==0){
          System.out.print(a[i]+" ");
        }
        else{
          int s=0;
          for( int l=0;l<b.length;l++){
            s+=b[l];
            
          }
          System.out.print(a[i]+s+" ");
          s=0;
          b[m]=0;
          m++;
        }
      }
    }
  }
}
