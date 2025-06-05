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
public void insertAtBeg(int data){//5
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
}
  //reversebygroup
    public static Node group(Node head, int k){
        Node curr = head;
        Node next = null;
        Node prev = null;
        int count=0;
        while(curr!=null && count<k){
        next = curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        count++;
    }
    if(next!=null){
        head.next=group(next,k);
        
    }
    return prev;
    }
     public void Group(int n){
        head=group(head,n);
    }

//display
    public void display(){
        Node temp=head;//4000-
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
       sll.display();
      //5->4->3->2->1->null
       sll.Group(3);
       //3->4->5->1->2->null
       sll.display();
       
       }
}
