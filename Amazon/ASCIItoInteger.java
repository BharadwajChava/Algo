public class Solution {
    public int myAtoi(String str) {
        if(str.compareTo("") == 0)
            return 0;
        int sign = 1;
        int total = 0;
        int i = 0;
        while(i < str.length()){
            if((char)str.charAt(i) != ' ')
                break;
            i+=1;
        }
        if( (char)str.charAt(i)=='-' || (char)str.charAt(i)=='+' ){
                sign = (char)str.charAt(i) == '-'?-1:1;
                i+=1;
        }
        
        for(; i < str.length(); i++){
            int digit = str.charAt(i) - '0';
            if(digit < 0 || digit > 9)
                break;
            if(total > Integer.MAX_VALUE/10 || total == Integer.MAX_VALUE/10 && digit >= 8)
                return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            total = 10*total + digit;
        }
        
        return total*sign;
    }
}
