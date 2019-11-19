import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("吃饭");
        linkedList.addLast("吃夜宵");
        linkedList.addLast("吃晚饭");
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollFirst());
    }

}
