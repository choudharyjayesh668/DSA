public class Decending {
    public static void decresing(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        decresing(n-1);
    }
}
