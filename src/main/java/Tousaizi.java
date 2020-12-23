    /*
     * test your luck!!
     * auth
     * throw  three ball
     * */
public class Tousaizi {
        public static void main(String[] args) {
            int i = (int)(6*Math.random())+1;
            int j = (int)(6*Math.random())+1;
            int k = (int)(6*Math.random())+1;
            int x=i+j+k;
            if(x < 10){
                System.out.println("Bad luck!!!");
            }
            if(x>9 & x<15){
                System.out.println("Good luck!!!");

            }
            if(x>14){
                System.out.println("Excellent");
            }
            System.out.println("Your Score:"+x);
        }
    }


