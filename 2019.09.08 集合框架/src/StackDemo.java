import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("吃饭");
        stack.push("睡觉");
        stack.push("打豆豆");
        System.out.println(stack);
        System.out.println("--------------");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
