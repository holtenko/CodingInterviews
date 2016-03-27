import java.util.Stack;

public class Q5_PrintListReversingly{
  static class Node{
    Node next;
    int data;
  }
  public static void printListReversingly_Stack(Node head){
    Stack<Node> nodeStack=new Stack<Node>();
    Node node=head;
    while(node!=null){
      nodeStack.push(node);
      node=node.next;
    }
    while(!nodeStack.isEmpty()){
      System.out.println(nodeStack.pop().data);
    }
  }

  public static void printListReversingly_Re(Node head){
    Node node=head;
    if(head!=null){
      if(node.next!=null){
        printListReversingly_Re(node.next);
      }
      System.out.println(node.data);
    }
  }

  public static void main(String[] args){
    Node node1=new Node();
    Node node2=new Node();
    Node node3=new Node();
    node1.data=1;
    node1.next=node2;
    node2.data=2;
    node2.next=node3;
    node3.data=3;
    printListReversingly_Re(node1);
    printListReversingly_Stack(node1);
    Node node0=new Node();
    node0.data=0;
    printListReversingly_Re(node0);
    printListReversingly_Stack(node0);
    Node nodenull=null;
    printListReversingly_Stack(nodenull);
    printListReversingly_Re(nodenull);
  }


}
