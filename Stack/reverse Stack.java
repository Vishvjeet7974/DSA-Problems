import java.util.Stack;

public class Reverse

{

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println("Original Stack: " + stk);
        reverseStack(stk);
        System.out.println("Reversed Stack: " + stk);

    }

    public static void reverseStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int topElement = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, topElement);

    }

    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int topElement = stack.pop();
        pushAtBottom(stack, data);
        stack.push(topElement);
    }

}
