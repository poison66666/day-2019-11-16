import java.util.Arrays;

public class MyCircularQueue {
    private int[] array;
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public MyCircularQueue(int k) {
        array = new int[k];
    }



    public boolean enQueue(int value) {
        if(size == array.length) {
            return false;
        }
        array[rear] = value;
        rear = (rear +1)%array.length;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(size == 0) {
            return false;
        }
        front = (front+1) % array.length;
        size--;
        return true;
    }

    public int Front() {
        if(size == 0) {
            return -1;
        }
        return array[front];
    }

    public int Rear() {
        if(size == 0) {
            return -1;
        }
        int index = (rear -1 +array.length) %array.length;
        return array[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public void Print()
    {
        for(int i=front;i<array.length;i++)
            System.out.println(array[i]);
    }
    public static void main(String[] args) {
      // int[] array = new int[] {1 ,2 ,3 ,4 ,5 ,6};
       MyCircularQueue myCircularQueue = new MyCircularQueue(5);
       myCircularQueue.enQueue(1);
       myCircularQueue.enQueue(2);
       myCircularQueue.enQueue(3);
       myCircularQueue.enQueue(4);
       myCircularQueue.enQueue(5);
       myCircularQueue.Print();

       myCircularQueue.deQueue();
        System.out.println("----------");
       myCircularQueue.Print();
        System.out.println(myCircularQueue.isEmpty());
        System.out.println(myCircularQueue.isFull());
    }
}
