import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("c语言");
        courses.add("Java SE");
        courses.add("Java web");
        courses.add("Java EE");
        courses.add("c语言");
        System.out.println(courses);
        System.out.println(courses.get(0));//获得下标为0的元素
        System.out.println(courses);
        courses.set(0,"计算机基础");
        System.out.println(courses);
        List<String> subcourses = courses.subList(0,3);
        System.out.println(subcourses);
        List<String> courses2 = new ArrayList<>(courses);
        System.out.println(courses2);
        List<String> courses3 = new LinkedList<>(courses);
        System.out.println(courses3);
        ArrayList<String> courses4 = (ArrayList<String>)courses2;
        System.out.println(courses4);
        LinkedList<String> courses5 = (LinkedList<String>)courses3;
        System.out.println(courses5);
     }
}
