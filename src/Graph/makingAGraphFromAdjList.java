package Graph;
import java.util.*;
public class makingAGraphFromAdjList {
    public static Map<Integer,List<Integer>> buildMap(int n,int[][]edges){
        Map<Integer,List<Integer>>map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[]edge:edges){
            int u =edge[0],v=edge[1];
            map.get(u).add(v);
            map.get(v).add(u);
        }
        return map;
    }
    //Recursive valid path
    public static boolean validPathRecursive(Map<Integer,List<Integer>>map,int curr,int destination,Set<Integer>visited){
        if(curr==destination){
            return true;
        }
        visited.add(curr);
        for(int neighbor:map.get(curr)){
            if(!visited.contains(curr)){
                if(validPathRecursive(map,neighbor,destination,visited)){
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean validPath(Map<Integer,List<Integer>>map, int source, int destination) {
        Queue<Integer>q=new LinkedList<>();
        Set<Integer>visited=new HashSet<>();
        q.add(source);
        visited.add(source);
        while (!q.isEmpty()){
            int curr = q.poll();
            if(curr==destination)return true;
            for(int neighbor:map.get(curr)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int n =6;
        int[][]edges={{0,1},{0,2},{3,5},{5,4},{4,3}};
        Set<Integer>visited = new HashSet<>();
        System.out.println(validPath(buildMap(n,edges),0,5));
        System.out.println(buildMap(n,edges));
        System.out.println(validPathRecursive(buildMap(n,edges),0,5,visited));
    }
}
