import java.util.Stack;

class Solution {
    public boolean isPalindrome(int x) {

        Stack<Character> stack = new Stack<>();

        String str = String.valueOf(x);

        if (str.length()==1){
            return true;
        }

        for(int i=0 ; i<str.length() ; i++){
            stack.push(str.charAt(i));
        }

        int count=0;
        while(!stack.empty()){
            if (stack.pop()!=str.charAt(count)){
                return false;
            }
            else{
                count++;
            }
        }
        return true;
    }
}
