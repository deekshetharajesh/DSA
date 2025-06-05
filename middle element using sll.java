class SLL{
    //class- Node
    static class Node{
        
        int data;//4 
        Node next;//12
        Node(int data){
            this.data=data;
        }
    }   
    //head 
    private Node head=null;
//insertAtBeg()
public void insertAtBeg(int data){
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
}
public void Middle()
{
    Node fast=head;
    Node slow=head;
    while(fast.next!=null&&fast.next.next!=null)
    {
       
        fast=fast.next.next;
        slow=slow.next;
    }
    
    System.out.println(slow.data);
}
//display
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }System.out.print("null");
    }
}    
 public class Main{   
    public static void main(String[] args){
         SLL sll=new SLL();
       sll.insertAtBeg(1);
       sll.insertAtBeg(2);
       sll.insertAtBeg(3);
       sll.insertAtBeg(4);
       sll.insertAtBeg(5);
         //5->4->3->2->1->null
       sll.display();
       //3
       sll.Middle();
       }
}
