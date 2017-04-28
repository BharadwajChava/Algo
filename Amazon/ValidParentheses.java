public class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        int i = 0;
        Stack<Character> ss = new Stack<Character>();
        while(i < len){
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '['){
                ss.push(c);
            }else if(c == '}' || c == ')' || c == ']'){
                if(ss.empty())
                    return false;
                if( c == '}' && (char)ss.peek() == '{' || c == ')' && (char)ss.peek() == '(' || c == ']' && (char)ss.peek() == '['){
                    ss.pop();
                }else
                    return false;
            }
            i+=1;
        }
        if(ss.empty())
            return true;
        return false;
    }
}
