import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    private ArrayList<Integer> normal;
    private ArrayList<Integer> min;

    public MinStack() {
        normal = new ArrayList<>();
        min = new ArrayList<>();
    }

    public void push(int x){
        normal.add(x);
        if(min.size() == 0) {
            min.add(x);
        }else if(x <= min.get(min.size()-1)) {
            min.add(x);
        }
    }

    public void pop() {
        int e = normal.remove(normal.size()-1);
        if(e == min.get(min.size()-1)) {
            min.remove(min.size()-1);
        }
    }

    public int top() {
        return normal.get(normal.size()-1);
    }

    public int getMin() {
        return min.get(min.size()-1);
    }

    public void print() {
            System.out.println(normal);
    }

    public static void main(String[] args) {
/*
        new MinStack().push(1);
        new MinStack().push(2);
        new MinStack().print();
  */
        MinStack ms=new MinStack();
        ms.push(9);
        ms.push(5);
        ms.push(9);
        ms.push(5);
        ms.push(1);
        ms.print();
        System.out.println(ms.normal);
        System.out.println(ms.min);
    }
}
