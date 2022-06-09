public class SetC{
  public static void triangle(int i){
    if(i>0){
      int k= 5-i;
      helper(-k);
      helper(i);
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
//12345
// 1234
//  123
//   12
//    1


