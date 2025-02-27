public class LinkedList {

    Node head;
    private int size;

    LinkedList() {

        this.size = 0;
    }

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addNewNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addNodeAtStarting(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addNodeAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void addNodeAtGiveIndex(int data, int index) {
        Node newNode = new Node(data);

        Node currNode = this.head;
        if (index == 0) {
            newNode.next = currNode;
            this.head = newNode;
            return;
        } else {

            for (int i = 0; i < index - 1 && currNode != null; i++) {
                currNode = currNode.next;
            }
            if (currNode != null) {
                newNode.next = currNode.next;
                currNode.next = newNode;
            }
        }

    }

    public void deleteNodeAtStarting() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteNodeAtLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int deleteNodeAtGivenIndex(int index) {
        if (head == null) {
            System.out.println("list is allready empty");
            return -1;
        }

        size--;

        int deletedData = -1;

        Node currNode = head;
        Node previous = null;

        if (index == 0) {
            deletedData = head.data;
            head = head.next;
            return deletedData;
        } else {
            for (int i = 0; i < index && currNode != null; i++) {
                previous = currNode;
                currNode = currNode.next;
            }

            if (currNode != null && index != -1) {
                deletedData = currNode.data;
                previous.next = currNode.next;
            }

            return deletedData;
        }

    }

    // Printing Linked list data

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // size of Linked_List

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        list.addNewNode(4);
        list.addNewNode(5);

        list.printList();

    }
}