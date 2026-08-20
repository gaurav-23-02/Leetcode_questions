package Graph;

import java.util.*;

public class Leetcode_797 {
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>allPath = new ArrayList<>();
        List<Integer>path = new ArrayList<>();
        path.add(0);
        int end =graph.length-1;
        dfs(0,graph,end,path,allPath);
        return allPath;
    }
    private static void dfs(int curr,int[][]graph,int end,List<Integer>path,List<List<Integer>>allPath){
        if(curr==end){
            allPath.add(new ArrayList<>(path));
            return;
        }
        for(int neighbor:graph[curr]){
            path.add(neighbor);
            dfs(neighbor,graph,end,path,allPath);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[][]graph={{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(graph));

    }
}
