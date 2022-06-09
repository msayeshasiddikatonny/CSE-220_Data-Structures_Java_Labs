public class WRM{
  private int st=0; private int size=0;
  private Patient a[]=new Patient[20];
  public void RegisterPatient(Patient p){
    a[(st+size)%a.length]=p;
    size++;
  }
  public void Serve(){
    a[st]=null;
    st=(st+1)%a.length;size--;
  }
  
  public void CancelAll(){
    a=new Patient[20];st=0;size=0;
  }
  public boolean  CanDoctorGoHome(){
    if(size==0){
      return true;
    }
    return false;
  }
  public  void ShowAllPatient(){
    for(int i=0;i<size;i++){
      Patient min=a[i] ;int min_idx=i;
      for(int j=i+1;j<size;j++){
        if(a[j].getName().compareTo(min.getName())<0){
          min=a[j]=min; min_idx=j;
        }
      }
      Patient temp=a[i];a[i]=min;a[min_idx]=temp;
    }
    for(int i=0;i<size;i++){
      System.out.println(a[i].id);
    }
  }
}