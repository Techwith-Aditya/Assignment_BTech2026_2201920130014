// Problem: Next Greater Element II

// Brute-Force Solution ( TC: O(n^2) || SC: O(n) ):
// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n=nums.length;
//         int[] nge=new int[n];
//         for(int i=0; i<=n-1; i++)
//         {
//             if(n==1)
//             {
//                 nge[i]=-1;
//             }
//             for(int j=i+1; j<=i+n-1; j++)
//             {
//                 int index=j%n;
//                 if(nums[index]>nums[i])
//                 {
//                     nge[i]=nums[index];
//                     break;
//                 }
//                 else
//                 {
//                     nge[i]=-1;
//                 }
//             }
//         }
//         return nge;
//     }
// }

// More Optimised ( TC: O(4n) || SC: O(2n)+O(n) ):
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] nge=new int[n];
        Stack<Integer> s=new Stack<>();

        for(int i=2*n-1; i>=0; i--)
        {
            while(!s.isEmpty() && s.peek()<=nums[i%n])
            {
                s.pop();
            }
            if(i<n)
            {
                if(s.isEmpty())
                {
                    nge[i]=-1;
                }
                else
                {
                    nge[i]=s.peek();
                }
            }
            s.push(nums[i%n]);
        }
        return nge;
    }
}
