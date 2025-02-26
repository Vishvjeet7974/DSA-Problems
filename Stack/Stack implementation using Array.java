
public class Main {

    static class Stack {

        private int arr[];
        private int top;

        public Stack() {
            arr = new int[1000];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(int data) {
            arr[++top] = data;
        }

        public int pop() {
            if (isEmpty())
                return -1;

            return arr[top--];
        }

        public int peek() {
            if (isEmpty())
                return -1;

            return arr[top];
        }

    }

    public static void main(String[] args) {

        Stack stk = new Stack();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }

    }

}
