class DoublyList {
    static class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;

    public void insertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) {
            head.previous = newNode;
        }

        head = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        list.insertAtBeg(2);
        list.insertAtBeg(4);
        list.insertAtBeg(6);
        list.insertAtBeg(8);
        list.display(); 
      
    }
}
