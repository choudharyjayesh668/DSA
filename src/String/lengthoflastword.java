public class lengthoflastword {
    public static int lengthoflastword(String s){
        int j=s.length()-1;
        int count=0;
        while (j>=0 && s.charAt(j) == ' '){
            j--;
        }
        while (j>=0 && s.charAt(j) != ' '){
            count++;
            j--;
        }
        return count;
    }
}
