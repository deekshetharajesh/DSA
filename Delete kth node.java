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
//delete at index
public void deleteAtInd(int index)
{
    Node temp=head;
    
    for(int i=1;i<index-1;i++)
    {
        temp=temp.next;
    }
    temp.next=temp.next.next;
  
}
//delete at kth node
public void KthNode(int n)
{
   int length = 0;
    Node temp=head;
    while (temp != null)
    {
    length++;
    temp = temp.next;
    }

    for (int i = length / n; i >= 1; i--)
    {
        deleteAtInd(i * n); 
    }

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
       sll.KthNode(2);
       //5->3->1->null
       sll.display();
       
       }
}
