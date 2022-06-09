public class Patient{
 private String name; private int age;private String bloodGroup;public String  id
   ;
 public Patient( String n,int a,String b,String i ){
   name=n;age=a;bloodGroup=b;id=i;
 }
 public void setName(String n){
   name=n;
 }
 public void setAge(int a){
age=a;
 }
 public void setBloodGroup(String b){
  bloodGroup=b;
 }
 public String getName(){
   return name;
 }
 public  int getAge(){
   return  age;
 }
 public String getBloodGroup(){
   return bloodGroup;
 }
}