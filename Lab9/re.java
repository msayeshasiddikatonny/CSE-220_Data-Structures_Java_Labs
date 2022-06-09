public class re{
  
  public static void main(String []args){
    
    int      temp1= factorial (1);
    System.out.println("Task1");
    System.out.println("factorial result "+temp1);
    int      temp2= fibonacci (1);
    System.out.println("Task2");
    System.out.println("fibonacci result "+temp2);
    int a[]={1,2,3,4,3}; 
    System.out.println();
    System.out.println("Task3");
    print(a,0);
    int temp3=power(2,3);
    System.out.println("result of power "+temp3);
        System.out.println("Task4");
        String s=bin(4);
        System.out.println("binary form "+s);
        
    int [] a1 = {10,20,30,40};
    LinkedList h1 = new LinkedList(a1);
            System.out.println("Task7"); 
            reverselIst(h1.head);
            
  }
  public static  int factorial (int i){   
    if(i==9) {
      return 9;
    }
    return i*factorial (i+1);
  }
  public static int fibonacci(int i){
    if(i==9) {
      return 9;
    }
    return i+fibonacci (i+1);
  }
  public static  void print(int []a,int i){
    System.out.print(a[i]+" ");
    
    if(i<a.length-1)
     print(a,i+1);
  }
  public static int power(int i,int j){
    if(j==1)
      return i;
    return i*i;
  }
  public static String bin(int i){
    if(i==1){
      return "1";
    }
    if(i==0)
            return "0";
    return bin(i/2)+i%2;
  }
  public static int addList(Node h,int s){
    if(h!=null){
      s+=h.element;
      addList(h,s);
      
    }
    return s;
  }
  public static void reverselIst(Node h){
    if(h!=null){
      reverselIst(h.next);
      System.out.print(h.element+" ");
    }
  }
}