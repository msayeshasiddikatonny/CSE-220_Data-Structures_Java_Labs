public class Quiz  {
    int size;
    Node front=null;
    Node rear=null;
    
    
    public Quiz(){
        size = 3;
        Node x =new Node(5,null,3);
         front=x;
         
        Node x1 =new Node(10,null,3);
        front.next=x1;
        Node x2 =new Node(15,null,3);
        x1.next=x2;
        rear=x2;
        size=3;
    }

    public void enqueue(int o,int k)  {
      int c=0;
      Node x =new Node(o,null,k);
      Node s=null;Node p=null;
      for( Node n=front;n!=null;n=n.next){
        c++;
        if(front.key>k){
          s=n;break;
        }
        else{
           p=n;
        }
        
      }
      if(p==null){
        x.next=s;front=x;
      }
      if(s==null){
        p.next=x;
      }
      else{
        x.next=s;
        p.next=x;
      }
      size++;
    }
   public int   dequeue(){
      Node x=front;
     int i=front.element;
     front=front.next;x.next=null;size--;
     return i;
    }
}