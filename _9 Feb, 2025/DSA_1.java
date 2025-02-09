// Problem: Longest Valid Parentheses

// ____________My Noob Solution (accepting test cases only here)___________

// import java.util.Stack;
// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack<Character> st=new Stack<>();
//         int count=0;
//         for(int i=0; i<s.length(); i++)
//         {
//             if(s.charAt(i)=='(')
//             {
//                 st.push(s.charAt(i));
//             }
//             else
//             {
//                 if(st.isEmpty()) // ')' remained unmatched...
//                 {
//                     continue;
//                 }
//                 char top=st.peek();
//                 st.pop();
//                 if(top=='(')
//                 {
//                     count=count+2;
//                 }
//             }
//         }
//         return count;
//     }
// }

// ___________Easiest Solution___________
// class Solution {
//     public int longestValidParentheses(String s) {
//         int noOfLeftBracket=0;
//         int noOfRightBracket=0;
//         int max=0;

//         for(int i=0; i <s.length(); i++)
//         {
//             if(s.charAt(i)=='(')
//             {
//                 noOfLeftBracket++;
//             }
//             else if(s.charAt(i)==')')
//             {
//                 noOfRightBracket++;
//             }
//             if(noOfLeftBracket==noOfRightBracket)
//             {
//                 max=Math.max(max, noOfLeftBracket*2);
//             }
//             else if(noOfRightBracket>noOfLeftBracket)
//             {
//                 noOfLeftBracket=0;
//                 noOfRightBracket=0;
//             }
//         }

//         noOfLeftBracket=0;
//         noOfRightBracket=0;
//         for(int i=s.length()-1; i>=0; i--)
//         {
//             if(s.charAt(i)=='(')
//             {
//                 noOfLeftBracket++;
//             }
//             else if(s.charAt(i)==')')
//             {
//                 noOfRightBracket++;
//             }
//             if(noOfLeftBracket==noOfRightBracket)
//             {
//                 max=Math.max(max, noOfLeftBracket*2);
//             }
//             else if(noOfLeftBracket>noOfRightBracket)
//             {
//                 noOfLeftBracket=0;
//                 noOfRightBracket=0;
//             }
//         }
//         return max;
//     }
// }

import java.util.Stack;
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int maxLength=0;

        for(int i=0; i<s.length(); i++) 
        {
            if(s.charAt(i) == '(') 
            {
                stack.push(i); 
            } 
            else 
            {
                stack.pop(); 
                if(stack.isEmpty()) 
                {
                    stack.push(i);
                } 
                else 
                {
                    maxLength = Math.max(maxLength, i-stack.peek());
                }
            }
        }
        return maxLength;
    }
}
