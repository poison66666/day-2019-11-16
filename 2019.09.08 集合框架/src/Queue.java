import java.util.Stack;

public class Queue {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public Queue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if(out.isEmpty()) {
            while(!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if(out.isEmpty()) {
            while(!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(8);
        queue.push(7);
        queue.push(6);
        System.out.println(queue.in);
        queue.pop();
        System.out.println(queue.in);
        System.out.println(queue.out);
        System.out.println(queue.peek());
        System.out.println(queue.empty());
    }
}
