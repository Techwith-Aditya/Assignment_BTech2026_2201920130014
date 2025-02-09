// Problem: Evaluation of Postfix Expression

class Solution {
    public static int evaluatePostFix(String S) {
        Stack<Integer> stack = new Stack<>();
        
        for (char c : S.toCharArray()) 
        {
            if (Character.isDigit(c)) 
            {
                stack.push(c - '0');
            } 
            else 
            {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) 
                {
                    case '+': 
                        stack.push(a + b); 
                        break;
                    case '-': 
                        stack.push(a - b); 
                        break;
                    case '*': 
                        stack.push(a * b); 
                        break;
                    case '/': 
                        stack.push(a / b); 
                        break;
                }
            }
        }
        return stack.pop();
    }
}
