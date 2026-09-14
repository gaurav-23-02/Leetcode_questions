package Dyanmic_programming;

public class mazeObstacleUniquePath {
    public static int helper(int[][]maze,int m,int n){
        if(m==0&&n==0)return 1;
        if(m<0||n<0)return 0;
        if(maze[m][n]==-1)return 0;
        int left=helper(maze,m,n-1);
        int up=helper(maze,m-1,n);
        return up+left;
    }
    public static int uniqueMaze(int[][]maze){
        int m=maze.length-1;
        int n=maze[0].length-1;
        return helper(maze,m,n);
    }
    public static void main(String[] args) {
        int[][]maze = {{0,0,0},
                      {0,-1,0},
                      {0,0,0}};
        System.out.println(uniqueMaze(maze));
    }
}
