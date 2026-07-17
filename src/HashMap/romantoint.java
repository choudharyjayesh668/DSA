public class romantoint {
    public static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static int romanToInt(String s) {
        int finalans=0;
        for (int i=0;i<s.length();i++){
            int currchar=value(s.charAt(i));
            if (i<s.length()-1){
                int nextchar=value(s.charAt(i+1));
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
