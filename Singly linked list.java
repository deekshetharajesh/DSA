class SLL{
    //class- Node
    static class Node{
        
        int data;
        Node next;
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
 //insertAtEnd()
public void  insertAtEnd(int data){
    Node newNode=new Node(data);
    Node temp=head;//4000
    while(temp.next!=null)
        temp=temp.next;
    temp.next=newNode;
}
//deleteAtEnd

public void deleteAtEnd()
{
    Node temp=head;
    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;
}

//deleteAtBeg
public void deleteAtBeg()
{
    head=head.next;
}
//insert at middele or indices
public void insertAtInd(int data,int index)
{
    Node newNode=new Node(data);
    Node temp=head;
    
    for(int i=1;i<index-1;i++)
    {
        temp=temp.next;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    
}
//delete At middele or indices
public void deleteAtInd(int index)
{
    Node temp=head;
    
    for(int i=1;i<index-1;i++)
    {
        temp=temp.next;
    }
    temp.next=temp.next.next;
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
       sll.insertAtEnd(5); 
       sll.display();
      //4->3->2->1->5->null
       sll.insertAtInd(10,2);
       sll.display();
       //4->10->3->2->1->5->null
       sll.deleteAtInd(4);
       //4->10->3->1->5->null
       sll.display();
       
      }
}
