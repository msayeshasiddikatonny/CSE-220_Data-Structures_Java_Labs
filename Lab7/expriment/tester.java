public class tester{
  public static void main(String []args){
    Object a[]={1,20,5,0,5,0,65,10};
  LinkedList list=new LinkedList(a);
  list.printList();
  System.out.println(list.nodeAt(5));
  list.sort();
    list.printList();
     Node list1=list.nodeAt(0);
    System.out.println(list.checkPalindrome(list1));
  }
}