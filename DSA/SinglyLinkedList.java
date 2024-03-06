package DSA;

public class SinglyLinkedList {
    static class Node {
        int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;
        Node tail;

        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        public void delete(int data) {
            Node current = head;
            Node previous = null;

            while (current != null) {
                if (current.data == data) {
                    if (previous != null) {
                        previous.next = current.next;
                    }
                }
                previous = current;
                current = current.next;
            }
        }

        public void showElements() {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        System.out.println("Nodes after insertion");
        linkedList.showElements();

        linkedList.delete(3);
        System.out.println("Nodes after deletion");
        linkedList.showElements();

    }
}
