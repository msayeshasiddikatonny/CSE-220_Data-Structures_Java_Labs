public class DoublyList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head = new Node(null, null, null);
    Node tail = head;
    
    for(int i = 0; i<a.length; i++){
      Node mn = new Node(a[i], null, null);
      tail.next = mn;
      mn.prev=tail;
      tail=tail.next;
    }
    tail.next=head; // Making it circular
    head.prev=tail;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    
    int c=0;
    for (Node n = head; n.next!= head; n = n.next){ 
      c++;
       
        
    }
    return c;
  }
  
  /* prints the elements in the list */
    public void forwardprint(){
         for (Node n = head.next; n != head ; n = n.next)    
      System.out.print(n.element +" "); 
    System.out.println();
   
    }
    
    public void backwardprint(){
         
 
  for (Node n =  head.prev; n.prev!= head.prev; n = n.prev)    
      System.out.print(n.element +" "); 
    System.out.println();
   
    
} 
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
         Node n=head.next;
    for(int i=0;i<idx && n.next!= head ;i++,n=n.next);
    
    return n;

    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
      int i=0;
        // i<idx &&
      for (Node n = head.next; n.next!= head.next; n = n.next) {   
      if(n.element.equals(elem))
        return i;
    }
    return -1; // please remove this line!

    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        if(idx==0){
      Node newNode=new Node(elem,null,null);
      newNode.next=head;
      head=newNode;
    }
    else{
      Node pred=nodeAt(idx-1);
      Node s=pred.next;
      Node newNode=new Node(elem,null,null);
      newNode.next=s;
      pred.next=newNode;
    }

    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
       if(index==0){
      Node removedNode=head;
      head=head.next;
      removedNode.next=null;
      return removedNode.element;
    }
    else{
      Node pred=nodeAt(index-1);
      Node removedNode=pred.next;
      pred.next=removedNode.next;//pred.next=pred.next.next
      removedNode.next=null;
      return removedNode.element;
    }

    }
    
    
  
}