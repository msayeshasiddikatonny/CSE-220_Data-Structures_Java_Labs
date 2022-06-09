import java.util.Scanner;
public class Quiz2{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the length of the array");
    int l=sc.nextInt();
    int a[]=new int[l];
     int b[]=new int[l];
    System.out.println("please enter the  size of the array");
    int s=sc.nextInt();
    for(int i=0;i<s;i++){
      System.out.println("please enter the element of the array");
      a[i]=sc.nextInt();
    }
    int max=a[0];int max_ind=0;
    for(int i=1;i<s;i++){
      if(max<a[i]){
        max=a[i];max_ind=i;
      }
      
    }
    int second_max,second_max_ind;
    if(a[0]!=max){
          second_max=a[0];  second_max_ind=0;
    }
    else{
        second_max=a[1]; 
        second_max_ind=1;
    }
        for(int i=1;i<s;i++){
      if(second_max<a[i] && i!=max_ind ){
        second_max=a[i];second_max_ind=i;
      }
      
    }
         int i=0,p= second_max_ind+1;
         while(  p<a.length ){
           
          b[i]=a[p];
          
          i++;p++;
        }
         p=0;
                   while(  i<b.length ){ {
            
            b[i]=a[p];
                     i++;p++;
          }
        }
    for(int k:b){
      System.out.println(k);
        }
  }
}