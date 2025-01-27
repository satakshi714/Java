import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList{
    Node head;
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void traversal(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListInsertAtEnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            list.insertAtEnd(data);
        }
        System.out.println("List after inserting: ");
        list.traversal();
        sc.close();
    }
}