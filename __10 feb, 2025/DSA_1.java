// Problem: Multiply two linked lists

class Solution {
    private final long MOD = 1000000007; // jb multiple krke bhut bda number aa jayega, tb MOD apply krke hm remainder return kr dege...chhote numbers me to vhi answer hoga

    public long multiplyTwoLists(Node first, Node second) {
        long num1 = 0;
        long num2 = 0;

        while (first != null) 
        {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }

        while (second != null) 
        {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }

        return (num1 * num2) % MOD; 
    }
}
