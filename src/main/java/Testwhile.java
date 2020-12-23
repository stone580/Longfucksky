/*print 1-130,每行显示7个数
* */
public class Testwhile {
    public static void main(String[] args) {
        int i =1;
        while(i <= 130){
        if(i%7==0){
            System.out.println(i+"\t");
        }else{
            System.out.print(i+"\t");
        }
        i++;
        }
    }
}
