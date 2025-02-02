// Problem: Two Sum

// SOLUTION_1:
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0; i<nums.length; i++)
//         {
//             for(int j=i+1; j<nums.length; j++)
//             {
//                 if(nums[i]+nums[j]==target)
//                 {
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[2];
//     }
// }

// SOLUTION_2:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // this map will have (actual value, index)...
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int counterPart=target-nums[i];
            if(map.containsKey(counterPart))
            {
                return new int[]{map.get(counterPart), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
