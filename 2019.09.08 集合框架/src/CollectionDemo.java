import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo {
    public static void main(String[] args) {
        //Collection接口，元素为String类型
        Collection<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("----------------");
        list.add("I");
        list.add("love");
        list.add("java");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("----------------");
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("----------------");
        for(String s:list) {
            System.out.println(s);
        }
        System.out.println("----------------");
        list.remove("love");
        for(String s:list) {
            System.out.println(s);
        }
        System.out.println("----------------");
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
