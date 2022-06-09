public class LinkedList{
  Node head;
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node x=new Node(a[i],null);
      tail.next=x;
      tail=x;//tail=tail.next;
    }
    
    
  }  
    public  int countNode(){
      int c=0;
      for (Node n = head; n != null; n = n.next) 
        c++;
      return c; // please remove this line!
    }
    
    public Node nodeAt(Object e ,int c){
      Node n=head;Object x=e;
      for(int i=0;i<c && n!=null ;i++,n=n.next){
        x++;
        if(n.element.equals(x))
          return n;
      }
    }
    public void printList(){
      for (Node n = head; n != null; n = n.next)    
        System.out.print(n.element +" "); 
      System.out.println();
    }
    
    
    public Node nodeAt(Node x){
      Node n=head; 
      for(int i=0;i<c && n!=null ;i++,n=n.next){
        
        if(n.next.equals(x))
          return n;
      }
    }
    public   void insert(  Object elem ){
      Object t=elem+1;int c=countNode();
      Node s= nodeAt(elem, c);
      Node pred=nodeAt(s);
      Node newNode=new Node(elem,null);
      newNode.next=s;
      pred.next=newNode;
    }
  }