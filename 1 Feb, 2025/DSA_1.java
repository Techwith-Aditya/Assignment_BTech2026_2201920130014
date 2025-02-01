// Problem: Diagonal Traverse

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int i=0;
        int[] a=new int[rows*cols];
        int row=0;
        int col=0;
        boolean up=true;

        while(row<rows && col<cols)
        {
            if(up)
            {
                while(row>0 && col<cols-1)
                {
                    a[i++]=mat[row][col];
                    row--;
                    col++;
                }
                a[i++]=mat[row][col];
                if(col==cols-1)
                {
                    row++;
                }
                else
                {
                    col++;
                }
            }

            else
            {
                while(col>0 && row<rows-1)
                {
                    a[i++]=mat[row][col];
                    row++;
                    col--;
                }
                a[i++]=mat[row][col];
                if(row==rows-1)
                {
                    col++;
                }
                else
                {
                    row++;
                }
            }
            up=!up;
        }
        return a;
    }
}
