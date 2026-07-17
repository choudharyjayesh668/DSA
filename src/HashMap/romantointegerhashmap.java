import java.util.HashMap;

public class romantointegerhashmap {
    public static int romanToIntHashMap(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int finalans=0;
        for (int i=0;i<s.length();i++){
            int currchar=map.get(s.charAt(i));
            if (i<s.length()-1){
                int nextchar=map.get(s.charAt(i+1));
                if (currchar<nextchar){
                    finalans-=currchar;
                }else{
                    finalans+=currchar;
                }
            }else{
                finalans+=currchar;
            }
        }
        return finalans;
    }

}
