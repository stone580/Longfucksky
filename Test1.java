package Container;
/*
* Test Generic
* @SKY
* */

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Node ab = null;
        MyCollection<String> mc=new MyCollection<> ();
        mc.set("Marry",0);
        mc.set ("34",2);
        System.out.print (mc.get (2));
        System.out.println (ab);
    }

}
class MyCollection<E>{ //E can be any type,
    Object[] x = new Object[5];
    public  void set(E e,int index){
        x[index]=e;
    }
    public Object get(int index){
        return (E)x[index];
    }

}
