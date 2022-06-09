public class SetB{
  public static void triangle(int i){
    if(i>0){
      int k=i-1;
      helper(5-k);
     helper(-k);
         System.out.println();
          triangle(i-1);
    }
  }
  public static void helper(int i){
    if(i!=0){
      if(i<0){
        System.out.print(" ");
        helper(i+1);
      }
      if(i>0){
         helper(i-1);
        System.out.print(i);
       
         
      }
    }
  }
  public static void main(String[]args){
    triangle(5);
  }
}
//1     
//12    
//123   
//1234  
//12345 

 
