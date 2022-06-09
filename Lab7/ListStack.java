public class ListStack implements Stack{
    int size;
    Node top;
   
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
     
    // The number of items on the stack
    public int size(){
      int c=0;
    for (Node n = top; n != null; n = n.next) 
      c++;
    return c; // please remove this line!

    }
// Returns true if the stack is empty
    public boolean isEmpty(){
      int c=size();
      if(c==0)
        return true;
      return false;
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(char e)  {
      Node node=new Node(e,null);
      node.next=top;
      top=node;
      size++;
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public  char pop() throws StackUnderflowException{
      if(size !=0){
       char r=top.val ;
       Node x=top;x.next=null;
         top=top.next; size--;
       return r;
      }
      else{
        throw new StackUnderflowException();
      }
    }
                                                       
                                                       
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public  char peek() throws StackUnderflowException{
      if(size !=0){
        char r=top.val  ;
       return r;
      }
      else{
        throw new StackUnderflowException();
      }
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
      String s="[";
      for (Node n = top; n != null; n = n.next)    
      s+=n.val;
      s+="]";
      return s;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public char[] toArray(){
        char [] newData=new  char[size];int i=0;
       for(Node n = top; n != null; n = n.next){
       
        newData[i]=n.val; i++;
       }
      return newData;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(char e){
      int c=-1;
      for(Node n = top; n != null; n = n.next){
        if(n.val==e){
          c++;break;
        }
        else{
          c++;
        }
      }
      return c;
    }
}