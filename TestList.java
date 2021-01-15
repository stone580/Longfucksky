package Container;

import org.omg.Messaging.SyncScopeHelper;

import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<> ();
        System.out.println (c.size ());// print number of Collection
        System.out.println (c.isEmpty ());
        c.add ("Jack");
        c.add ("God!!");
        System.out.println (c.contains ("Jack"));//判断是否包含对象
        System.out.println (c);
        c.remove ("God!!");//把对象从容器移除，并不是删除对象，存的是对象的地址，删除的也是对象的地址
        System.out.println (c);//打印
        for(int i=2;i<3;i++){
            System.out.println ("SB");
        }
    }
}
