package Problem1;

public class ValidParentheses {
    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        if (str == null) {
            return true;
        } else if (str.length() % 2 != 0) {
            return false;
        }
        ArrayStack<Character> arrayStack = new ArrayStack(10);
        for(char c : str.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                arrayStack.push(c);
            } else if(c == ')' && arrayStack.size() != 0 && arrayStack.peek() == '(') {
                arrayStack.pop();
            } else if(c == ']' && arrayStack.size() != 0 && arrayStack.peek() == '[') {
                arrayStack.pop();
            } else if(c == '}' && arrayStack.size() != 0 && arrayStack.peek() == '{') {
                arrayStack.pop();
            } else {
                return false;
            }
        }
        return arrayStack.size() == 0;
    }
}
