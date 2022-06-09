public class WRM2{
  private  Node head; private int size=0;
 
  public void RegisterPatient(Patient p){
     Node t=new Node(p,null);
     if(size==0){
       head=t;
     }
     else{
       head.next=t;
     }
     size++;
  }
  public void Serve(){
    Node t=head;
     head=head.next;
     t.next=null;size--;
     
  }
  
  public void CancelAll(){
    head=null;
  }
  public boolean  CanDoctorGoHome(){
    if(size==0){
      return true;
    }
    return false;
  }
//  public  void ShowAllPatient(){
//    for(int i=0;i<size;i++){
//      Patient min= head.element.name ; 
//      for(Node i=head.next;i!=null;i=i.next){
//        if( i.element.getName().compareTo(min.getName())<0){
//          min= i.getName() ;  
//        }
//      }
//      Patient temp=a[i];a[i]=min;a[min_idx]=temp;
//    }
//    for(int i=0;i<size;i++){
//      System.out.println(a[i].id);
//    }
//  }
}