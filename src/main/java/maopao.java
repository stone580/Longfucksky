public class maopao {

    public static void main(String[] args) {
        int b;
        int[] a = {23, 34, 56, 72, 99, 125, 54, 42, 78, 33};
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        for(int k = 0; k < a.length; k++){
            System.out.println(a[k]);
        }
    }
}
