import java.util.*;
public class MyReader{
    //modify following line so that this method can throw Exception
    int readInteger( ) {
        Scanner sc = new Scanner(System.in);
         
        String s=sc.nextLine();
        if (s contains(".")){
         throw new IllegalAccessException("demo");
        }else{    
          System.out.println(s);
        }
        catch(IllegalAccessException e){
                    System.out.println("float");
        }
    }
}