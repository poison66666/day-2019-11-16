import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("吃饭");
        deque.offerFirst("睡觉") ;
        deque.addLast("打豆豆");
        deque.offerLast("玩游戏");
        System.out.println(deque.getFirst());
        System.out.println(deque.peekFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollLast());
       // System.out.println(deque.removeLast());
        System.out.println(deque.pollLast());
    }
}
