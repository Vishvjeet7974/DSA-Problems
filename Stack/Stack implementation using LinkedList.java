
class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty())
                return -1;

            int popped = head.data;

            head = head.next;

            return popped;
        }

        public static int peek() {
            if (isEmpty())
                return -1;

            return head.data;
        }

        public static void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;

            }
            Node temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Stack stk = new Stack();

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);

        stk.printStack();
    }
}