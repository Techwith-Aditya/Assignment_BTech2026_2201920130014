// Problem: Next Greater Element

class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int[] nge=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--)
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nge[i]=-1;
            }
            else
            {
                nge[i]=s.peek();
            }
            s.push(arr[i]);
        }
        
        // Converting this nge array into ArrayList because of return type of function...
        ArrayList<Integer> a=new ArrayList<>();
        for (int num : nge) 
        {
            a.add(num);
        }
        return a;
    }
}
