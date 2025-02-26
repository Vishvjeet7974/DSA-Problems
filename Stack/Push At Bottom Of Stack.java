import java.util.Stack;

public class Main
{

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original Stack: " + stack);
        pushAtBottom(stack, 6);
        System.out.println("Stack after pushing 6 at bottom: " + stack);
    }

    public static void pushAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int topElement = stack.pop();
        pushAtBottom(stack, data);
        stack.push(topElement);
    }

}
