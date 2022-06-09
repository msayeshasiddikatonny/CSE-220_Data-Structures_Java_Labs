import java.util.Scanner;
public class QuizTester{
  public  static Object[] toArray(String s){
       Object [] newData=new Object[ s.length()] ;
       for(int i=0;i<s.length();i++){
       newData[i]=s.charAt(i);
         
       }
      return newData;
    }
  public static void main (String[]args){
    int newV=0;int pre=0;int su=0;
    Scanner SC = new Scanner(System.in);
    ListStack s=new ListStack();
    
    Object[] a=toArray("231*+9-");
     
    for(int i=0;i<a.length;i++){
      int j=(int)a[i];
      if(j<58 && j>47){
        s.push(a[i]);
      }
      else{
        if(   j>41 && j<48){
          try{
            su=(int)s.pop();
          
            pre=(int)s.pop();
          }
          catch(StackUnderflowException e){
            System.out.println("undefine ex.");
      System.err.println("Stack Empty\n"+e);
      
       
    }

          if(j==37){
              newV=pre%su;
          }
          else {
            if(j==42){
                newV=pre*su;
            }
            else {
              if(j==43){
                  newV=pre+su;
              }
              else {
                if(j==45){
                    newV=pre-su;
                }
                else {
                  if(j==47){
                      newV=pre/su;
                  }
                  else {
                    if(j==94){
                        newV=pre^su;
                    }
                    else{
                      System.out.println("undefine exp.");
                      break;
                    }
                  }
                }
              }
            }
          }
        }
      }
       s.push((Object)newV);
    }
    //if(s.size()==1){
     System.out.println(s.toString());
   // }
//    else{
//      System.out.println("undefine expr.");
//    }
  }
}