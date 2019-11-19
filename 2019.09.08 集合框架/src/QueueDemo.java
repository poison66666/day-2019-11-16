import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue.add("吃饭"));
        System.out.println(queue.offer("睡觉"));
        System.out.println(queue.add("打豆豆"));
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println("-----------");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
       // System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println("----------");
        System.out.println(queue.peek());
    }
}
