import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("--------------");
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("--------------");
        map.put("作者","鲁迅");
        map.put("标题","狂人日记");
        map.put("发表时间","1918");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        System.out.println("--------------");
        //map是无序的，输入顺序不一定是输出顺序
        for(Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey() + "=" + entry.getValue());
           // System.out.println(entry.getKey());
            //System.out.println(entry.getValue());
        }
    }
}
