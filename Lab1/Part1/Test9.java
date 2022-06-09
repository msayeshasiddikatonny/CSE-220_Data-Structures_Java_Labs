public class Test9{
  public static void display(int [] input,int l){
    for (int i = 0; i < l; i++) {
      System.out.print(input[i] + " ");
    }
  }
  public static void displaySqure(int [] input,int l){
    for (int i = 0; i < l; i++) {
      System.out.print(Math.pow(input[i],2 )+ " ");
    }
  }
  public static void main(String [] args){
    int [] array = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    display(array,array.length);
    displaySqure(array,array.length);
    
  }
}

