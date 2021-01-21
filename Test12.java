package Container;

public class Test12 {
    public static void main(String[] args) {
        Integer a = 500;
        int b =500;
        Integer c = new Integer (500);


        System.out.println (a == b);
        System.out.println (a.equals (b));
        System.out.println (b == c);
    }
}
