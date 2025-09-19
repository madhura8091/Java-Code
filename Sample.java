class Node {
    int data;        
    Node next;       

    Node(int data) { 
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head=null;   

    // Insert new node at the end
    public void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            return;   
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n; 
        }
    }

    
    public void show() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Linked List is empty");
            return;
        }

        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class Sample {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        
        l1.insert(10);
        l1.insert(20);
        l1.insert(5);
        l1.insert(2);

        System.out.println("Linked List is :");
        l1.show();
    }
}