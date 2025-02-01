// Problem: Maximum Subarray Sum

public class KadanesAlgo {
    // n^2 solution (Showing TLE for 5 left cases):
    // class Solution {
    //     public int maxSubArray(int[] nums) {
    //         int max=Integer.MIN_VALUE;
    //         for(int i=0; i<nums.length; i++)
    //         {
    //             int sum=0;
    //             for(int j=i; j<nums.length; j++)
    //             {
    //                 sum=sum+nums[j];
    //                 max=Math.max(sum,max);
    //             }
    //         }
    //         return max;
    //     }
    // }

    // Kadane's Algorithm: At least one element should be positive...because negative sum jaise dekhega vo 0 krta rhega....but agr sare negative h to vo if(sum<0) wali condition nhi lgayege...
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            sum=sum+nums[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // int[] a={-2,1,-3,4,-1,2,1,-5,4};
        // int ans=KadanesAlgo.maxSubArray(a);
        // System.out.println("Largest sum is: "+ans);
        // __________________________________________________________________________
        // Mtlb jb static hoga function, tb class k nam se function call hota h...Because Static methods belong to the class itself, not an object...
        // public static int maxSubArray(int[] nums) {
        // 
        // }
        // __________________________________________________________________________
        // But when there is no static word there, so declare a object. Because Non-static methods require an object to be called because they operate on the instance's data...
        
        KadanesAlgo k=new KadanesAlgo();
        int[] a={5,4,-1,7,8};
        int ans=k.maxSubArray(a);
        System.out.println("Largest sum is: "+ans);
    }
}
