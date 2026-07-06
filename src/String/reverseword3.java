public class reverseword3 {
    public static String reverseWordsIII(String s){
        StringBuilder sb=new StringBuilder("");
        String[] word=s.split(" ");
        for (int i=0;i< word.length;i++){
            for (int j=word[i].length()-1;j>=0;j--){
                sb.append(word[i].charAt(j));
            }
            if (i!= word.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
