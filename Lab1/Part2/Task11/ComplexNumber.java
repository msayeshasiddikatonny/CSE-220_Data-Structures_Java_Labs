public class ComplexNumber extends RealNumber{
  public double complexValue;
  ComplexNumber(){
    super.setRealValue(1.0);
    complexValue=1.0;
  }
  ComplexNumber(int x,int y){
    super.setRealValue(x);
    complexValue=y;
  }
  public String toString(){
    System.out.println( super.toString());
    return "ComplexPart: "+complexValue ;
  }
  public void check(){
    System.out.println("I'm in  ComplexNumber class");
    super.ping();
    System.out.println("Checking ended.");
  }
}