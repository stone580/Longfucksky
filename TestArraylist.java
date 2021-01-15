package Container;

import java.util.ArrayList;
import java.util.List;

public class TestArraylist {
    public static void main(String[] args) {

        test01();
    }
    public static void test01(){
        List<String> list = new ArrayList<> ();
        list.add ("A");//按照索引递增添加值
        list.add ("B");
        list.add ("C");
        list.add ("D");
        list.add ("E");
        list.add ("F");
        System.out.println (list);

        list.add (3,"HI"); //start with 0
        System.out.println (list);

        list.set (3,"FUCK");//直接修改索引位置对应值（对应地址）
        System.out.println (list);
        System.out.println (list.get(3));
        System.out.println (list.indexOf ("B"));//返回对象的第一个索引值，不存在返回-1



    }
}
