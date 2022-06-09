public class Task6{
  public static void main (String []args){
    int []array={4,3,2,4,3,4};
    int flag=1;int k;
    if(array.length%2==0){
       k=(array.length/2)-1;
      for(int i=0;i<=k;i++){
        if(array[k-i]==array[k+i+1]){
        }
        else{
          flag=0;
          break;
        }
      }
    }
    else{
       k=(array.length/2);
      for(int i=0;i<=k;i++){
        if(array[k-i]==array[k+i]){
        }
        else{
          flag=0;
          break;
        }
      }
    }
      if(flag==1)
        System.out.println("Palindrome");
      else
        System.out.println(" Not Palindrome");  
    }
  }