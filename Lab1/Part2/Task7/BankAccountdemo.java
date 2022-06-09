public class  BankAccountdemo{
  public static void main(String[]args){
    BankAccount acc1=new BankAccount();
    acc1.setName("Ayesha");
    acc1.setAddress("Malibag");
    acc1.setAccountID("1830");
    acc1.setBalance(165478.23);
    acc1.addInterest();
    System.out.println("Name :"+acc1.getName()+" Address : "+acc1.getAddress()+" AccountID : "+acc1.getAccountID()+"  Balance : "+acc1.getBalance());
    BankAccount acc2=new BankAccount();
    acc2.setName("Siddika");
    acc2.setAddress("Badda");
    acc2.setAccountID("1831");
    acc2.setBalance(16548.433);
    System.out.println("Name :"+acc2.getName()+" Address : "+acc2.getAddress()+" AccountID : "+acc2.getAccountID()+"  Balance : "+acc2.getBalance());
    BankAccount acc3=new BankAccount();
    acc3.setName("Tanu");
    acc3.setAddress("Rampura");
    acc3.setAccountID("1832");
    acc3.setBalance( 100);
    acc3.addInterest();
    System.out.println("Name :"+acc3.getName()+" Address : "+acc3.getAddress()+" AccountID : "+acc3.getAccountID()+"  Balance : "+acc3.getBalance());
  }
}