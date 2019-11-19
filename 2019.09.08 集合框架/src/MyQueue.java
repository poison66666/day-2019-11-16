import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node next;
}

public class MyQueue {
    private Node head = null;
    private Node tail = null;
    private int size;

    public void offer(int v) {
        Node node = new Node();
        node.val = v;
        if(tail == null) {
            head = tail =node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int poll() {
        Node first = head;
        if(head.next != null) {
        head = head.next;}
        if(head == null) {
            tail = null;
        }
        size--;
        return first.val;
    }


    public void Print()
    {
        Node first=head;
       while(head != tail) {
           System.out.println(head.val);

               head = head.next;

       }
       if(head != null) {
        System.out.println(head.val);}
        head=first;
    }

    public int peek() {
        return head.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        //通常创建对象的方法如下
        MyQueue myQueue = new MyQueue();
        myQueue.offer(5);
        myQueue.offer(4);
        myQueue.offer(3);
        myQueue.offer(2);
        myQueue.offer(1);
        myQueue.Print();
        System.out.println("----------");
        System.out.println(myQueue.poll());
        System.out.println("----------");
        myQueue.Print();
        System.out.println("----------");
        System.out.println(myQueue.poll());
        System.out.println("----------");
        System.out.println(myQueue.peek());
        System.out.println("----------");
        System.out.println(myQueue.size);
        System.out.println("----------");
        System.out.println(myQueue.isEmpty());


        //带泛型的对象创建只是为了指明对象内部存放的数值的类型
        //MyQueue<> myqueue=new MyQueue<>();
    }
}
