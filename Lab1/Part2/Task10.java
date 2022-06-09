import java.util.Scanner;
public class Task10{
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    int [] a={1,4,8,16,25,36,49,64,81,100};
    int [] array= new int[a.length];
    System.out.println("please enter 1 for Right Rotate or enter 0 for Left Rotate ");
    int r=sc.nextInt();
    System.out.println("please enter the position");
    int p=sc.nextInt();
    int h=p;
    if(r==0){
      int i;
      for(i=0;i<a.length-p;i++){
        array[i]=a[h];
        h++;
      }
      for(int k=0;k<p;k++){
        array[i]=a[k];
        i++;
      }
    }
    else{
      if(r==1){
        int m=a.length-p;
        int i;
        for(i=0;i<p;i++){
          array[i]=a[m];
          m++;
        }
        for(int k=0;k<a.length-p;k++){
          array[i]=a[k];
          i++;
        }
      }
    }
    for(int f=0;f<array.length;f++){
      System.out.println(array[f]);
    }
  }
}
