//test Gouzaoqi  重载
public class TestObject {
    int id;
    String name;
    String pwd;
    public TestObject(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Use First one");
    }
    public TestObject(int id,String name,String pwd){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
        System.out.println("Use the Second one");
    }

    public static void main(String[] args) {
        TestObject p=new TestObject(101, "Jack","Hello");  //通过不同的实参调用不同的构造方法
        System.out.println(p.pwd);
    }
}
