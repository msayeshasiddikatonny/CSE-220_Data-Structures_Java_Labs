public  class recursion{
  public static void printReverse(int i){
    if(i>0){
    System.out.print(i+ " ");
    print(i-1);
    }
  }
   public static void print (int i){
    if(i>0){
    
    print(i-1);
    System.out.print(i+ " ");
    }
  }
    public int factorial(int n) {
  if(n==0)
  return 1;
  return n*factorial(n-1);
}
public int fibonacci(int n) {
  if( n==0)
  return 0;
  if(n==1 ||n==2)
  return 1;
  return fibonacci(n-1)+fibonacci(n-2);
}
  public static void main(String []args){
    printReverse(5);// 5 4 3 2 1 
    System.out.println();
    print(5);//1 2 3 4 5 
  }
   
}