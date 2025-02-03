// Warrior's Minimum Moves on Chessboard - Given an 8x8 chessboard, determine the minimum moves for a warrior to reach a destination, moving like both a knight and a king...

import java.util.*;
public class Game {
    private static final int[][] MOVES = {
        {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
        {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
        {0, 1}, {1, 0}, {0, -1}, {-1, 0},
        {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
    };

    public int minMoves(int x1, int y1, int x2, int y2) {
        boolean[][] vis=new boolean[8][8];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{x1, y1, 0});
        vis[x1][y1]=true;

        while (!q.isEmpty()) 
        {
            int[] curr=q.poll();
            int x=curr[0], y=curr[1], moves=curr[2];

            if(x==x2 && y==y2) 
            {
                return moves;
            }

            for(int[] move:MOVES) 
            {
                int nx=x+move[0], ny=y+move[1];

                if(nx>=0 && nx<8 && ny>=0 && ny<8 && !vis[nx][ny]) 
                {
                    vis[nx][ny]=true;
                    q.add(new int[]{nx, ny, moves+1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Game g=new Game();
        int x1=0, y1=0, x2=7, y2=7;
        int result=g.minMoves(x1, y1, x2, y2);
        System.out.println("Minimum moves required: "+result);
    }
}

