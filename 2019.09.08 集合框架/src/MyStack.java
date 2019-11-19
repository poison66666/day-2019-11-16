import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }
    public void push(int x) {
        queue.offer(x);
    }

    public int pop() {
        int size = queue.size();
        for(int i = 0;i<size-1;i++) {
            int v = queue.poll();
            queue.offer(v);
        }
        return queue.poll();
    }

    public int top() {
        int size = queue.size();
        for(int i = 0;i<size-1;i++) {
            int v = queue.poll();
            queue.offer(v);
        }
        int v = queue.poll();
        queue.offer(v);
        return v;
    }

    public boolean empty() {
        return queue.isEmpty();
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(9);
        myStack.push(8);
        myStack.push(7);

        System.out.println(myStack.queue);

        myStack.pop();
        System.out.println(myStack.queue);

        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}
