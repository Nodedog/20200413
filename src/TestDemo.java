


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


/*
*
*                   Collection接口
*
*
* */
public class TestDemo {
    public static void main(String[] args) {
        //1.实例化一个Collection对象，Collection是一个接口，必须new 一个对应的类
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

        //add 添加元素
        collection.add("xxn");
        collection.add("is");
        collection.add("good");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());



        //collection.toArray()把集合转换成一个数组
        //String也是集成Object。array ，看似是Object数组其实是一个String数组
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(collection);


        //用for each遍历collection
        for (String a : collection ) {
            System.out.println(a);
        }

        //判断元素是否存在
        boolean ret = collection.contains("xxn");
        System.out.println(ret);



        //删除指定元素
        collection.remove("xxn");
        System.out.println(collection);



        //清空所有元素
        collection.clear();
        System.out.println(collection);
    }
}
