package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class implementaion {
    public static class Graph{
        private final Map<Integer, List<Integer>> adjList = new HashMap<>();
        public void addVertex(int v){
            adjList.putIfAbsent(v,new ArrayList<>());
        }
    }
    public static void main(String[] args) {

    }
}
