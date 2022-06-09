public class LinkedList {
  public Node head;
  
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node x=new Node(a[i],null);
      tail.next=x;
      tail=x;//tail=tail.next;
    }
  }
  
  public void printList(){
    for (Node n = head; n != null; n = n.next)    
      System.out.print(n.element +" "); 
    System.out.println();
  }
  public Node nodeAt(int idx){
    Node n=head;
    for(int i=0;i<idx && n!=null ;i++,n=n.next);
    
    return n;
  }
  
  public    boolean checkPalindrome(Node h ){
    if(h.next!=null){
      int c=1;
      Node newReverse=new Node(h.element,null);
      Node tail=newReverse;
      for(Node i=h.next;i!=null;i=i.next){
        Node x=new Node (i.element,null);
        x.next=tail;
        tail=x;
        c++;
      }
      newReverse=tail;
      Node i=h;Node j=newReverse;
      for(int k=0;k<c;k++,i=i.next,j=j.next){
        if(i.element.equals(j.element)==true){
        }
        else{
          
          return false;
        }
      }
    }
    return true;
  }
  public void  sort(){
    for(Node i=head;i!=null;i=i.next){
      Object min= i.element;
      Node minIndex=i;
      for(Node j=i.next;j!=null;j=j.next){
        if((Integer)min>(Integer)(j.element)){
          minIndex=j;
          min= j.element;
        }
      } 
      Object t=i.element;
      i.element=minIndex.element;
      minIndex.element=t;
    }
    
  }
}