public class tree{
  public static int heigth(Node root){
    if(root==null){
      return -1;
    }
    return 1+ max(heigth(root.left),heigth(root.right));
  }
  public static int max(int x,int y ){
    if(x>y)
      return x;
          return y;
  }
  public static int level(Node n){
    if(n.parent==null)
      return 0;
    return 1+level(n.parent);
     
  }
  
  public static void main(String []args){
    Node root=null;
    root=new Node(15,null,null,null);
    root.left=new Node(10,null,null,root);
    root.right=new Node(20,null,null,root);
    root.left.left=new Node(8,null,null,root.left);
    root.left.right=new Node(12,null,null,root.left);
    root.right.left=new Node(25,null,null,root.right);
    
    
    System.out.println("Heigth  "+heigth(root));
        System.out.println("Level "+level(root.left));
  }
}