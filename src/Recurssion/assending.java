public class assending {
    public static void assending(int n){
        if (n==1){
            System.out.print(n+",");
            return;
        }
        assending(n-1);
        System.out.print(n+",");
    }
}
