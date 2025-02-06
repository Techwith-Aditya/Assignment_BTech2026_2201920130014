// Problem: Construct Binary Tree from String with bracket representation

class Solution {
    static int start = 0;
    
    public static Node treeFromString(String s) {
        if(s==null || s.length()==0) 
        {
            return null;
        }
        start=0;
        return helper(s);
    }
    
    private static Node helper(String s) {
        if(start>=s.length()) 
        {
            return null;
        }
        
        boolean neg=false;
        if(s.charAt(start)=='-') 
        {
            neg=true;
            start++;
        }
        
    
        int num=0;
        while(start<s.length() && Character.isDigit(s.charAt(start))) 
        {
            num=num*10 + (s.charAt(start)-'0');
            start++;
        }
        
        if(neg) 
        {
            num=-num;
        }
        
        Node root=new Node(num);
        
        if(start<s.length() && s.charAt(start)=='(') 
        {
            start++;
            if(s.charAt(start)==')') 
            {
                start++;
            } 
            else
            {
                root.left=helper(s);
                if(start<s.length() && s.charAt(start)==')') 
                {
                    start++;
                }
            }
        }
        
        if(start<s.length() && s.charAt(start)=='(') 
        {
            start++;
            if(s.charAt(start)==')') 
            {
                start++;
            } 
            else
            {
                root.right = helper(s);
                if(start<s.length() && s.charAt(start)==')') 
                {
                    start++;
                }
            }
        }
        
        return root;
    }
}
