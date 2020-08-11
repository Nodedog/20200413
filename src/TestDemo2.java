import java.util.HashMap;
import java.util.Map;




/*2.07.35
*
*                         Map接口
*
* */
public class TestDemo2 {
    public static void main(String[] args) {
        //实例化一个Map
        Map<String,String> map = new HashMap<>();
        System.out.println(map.isEmpty());
        System.out.println(map.size());


        //put插入若干个键值对  key =》 对应的value
        //反过来用value 不能找到对应的key
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");


        //使用get 根据key找对应的value
        System.out.println(map.get("1"));
        //如果没有该key 返回null
        System.out.println(map.get("0"));

        //找到key，则返回对应的value
        //没有key，则返回默认的defaultValue的值
        System.out.println(map.getOrDefault("0","x"));

        //使用contains哦安定元素是否存在
        //containsKey是比较高效的
        System.out.println(map.containsKey("1"));
        //containsValue是低效的
        System.out.println(map.containsValue("a"));



        //循环遍历Map.Entry，此处的Entry表示“条目”，一个一个的键值对
        //对于Map来说，保存的元素顺序 和插入顺序无关 有自己的规则
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //清空所有元素
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.size());
    }
}
