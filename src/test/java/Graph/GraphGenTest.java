package Graph;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
public class GraphGenTest {

    private GraphGen graph;

    @BeforeEach
    void setup() {
        graph = new GraphGen();
    }

    @Test
    void printGraph() {
        int n = 7;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 5}, {5, 6}, {4, 5}, {0, 4}, {3, 4}};

        graph = new GraphGen<>();
        for (int i = 0; i < n; i++)
            graph.addVertex(i);

        for (int[] ed : edges)
            graph.addEdge(ed[0], ed[1], false);

        graph.printGraphInList();
        //System.out.println("DFS Visited {} "+ graph.dfs(4));
        log.info("DFS Visited {} ", graph.dfs(4));
    }



    /**
    * SpecialX has launched a special spacecraft program that is aimed at sending people into space. The spacecraft is designed to carry only two astronauts at a time. Melon Musk has an idea to sort things out and select who goes in which trip. He wants to choose the two astronauts from different countries. You will be given a list of pairs of astronaut IDs. Each pair is made of astronauts from the same country. Determine how many pairs of astronauts from different countries he can choose from.
    *
    * Input Format
    *
    * The first line contains two integers N and P, the number of astronauts and the number of pairs. Each of the next P lines contains 2 space-separated integers denoting astronaut IDs of two who share the same nationality.
    *
    * Constraints
    *
    * 1 ≤ N ≤ 25,000
    * 1 ≤ P ≤ 25,000
    * Output Format
    *
    * An integer A that denotes the number of ways to choose a pair of astronauts from different coutries.
    *
    * Sample Input 0
    *
    * 5 3
    * 0 1
    * 2 3
    * 0 4
    * Sample Output 0
    *
    * 6
    * Explanation 0
    *
    * Persons numbered [0,1,4] belong to one country, and those numbered [2,3] belong to another. Elon has 6 ways of choosing a pair: [0,2] , [0,3] , [1,2] , [1,3] , [4,2] , [4,3]
    *
    * Sample Input 1
    *
    * 4 1
    * 0 2
    * Sample Output 1
    *
    * 5
    * Explanation 1
    *
    * Persons numbered [0,2] belong to the same country, but persons 1 and 3 don't share countries with anyone else. Elon has 5 ways of choosing a pair: [0,1] , [0,3] , [1,2] , [1,3] , [2,3]
    * 0 2 , 1, 3
    */
    @Test
    public void astronautPairs(){
        int n = 5;
        int [][] astMat =  {{0, 1}, {2, 3}, {0, 4}};
        for(int i=0;i<n; i++)
            graph.addVertex(i);
        for(int [] ast : astMat)
            graph.addEdge(ast[0], ast[1], false);
        List<Set<Integer>> comps = sizeOfConnectedComponentsOfGraph(graph, n);
        int[] sizes = new int[comps.size()];
        //total - number of connected components
        int total= n*(n-1)/2;
        for(Set comp : comps){
            int temp = comp.size();
            total = total - temp*(temp-1)/2;
        }
        log.info("Total {}", total);
    }


    public  List<Set<Integer>> sizeOfConnectedComponentsOfGraph(GraphGen graph, int n){
        List<Set<Integer>> conn_comps = new ArrayList<>();
        for(int i =0; i <n ; i++){
            //for each i do the dfs if that node is not visited already
            boolean visited = false;
            int finalI = i;
            visited = conn_comps.stream().anyMatch(conn_comp -> conn_comp.contains(finalI));
            if(!visited)
                conn_comps.add(graph.dfs(i));
        }
        return conn_comps;
    }


    /**CourseSchedule
     *
     */
    @Test
    void CourseSchedule(){
        int numCourses = 7;
        int[][] prerequisites = {{1,4},{2,4},{3,1},{3,2},{5,6},{6,5}};
        for(int i =0; i< numCourses ; i++)
            graph.addVertex(i);

        for(int[] edge: prerequisites)
            graph.addEdge(edge[0], edge[1], true);

        boolean[] visited = new boolean[numCourses];
        boolean[] callStack = new boolean[numCourses];
        for(int i =0; i<numCourses; i++){
            if(dfsContainsCycle(i, visited, callStack, graph)) {
                log.info("Cant finish course {}", i);
                return;
            }
        }
        log.info("Can finish course");
    }


    public  boolean dfsContainsCycle(int node, boolean[] visited, boolean[] callStack, GraphGen graph){
        visited[node] = true;
        callStack[node] = true;
        for(int nbr : (List<Integer>) graph.getNeighbours(node)){
            if(callStack[nbr]) return true;
            else if(visited[nbr]==false)
                if(dfsContainsCycle(nbr, visited, callStack, graph)) return true;
        }
        callStack[node] = false;
        return false;
    }

    /**
     * CycleDetectionDirectedGraph
     */

    @Test
    public void cycleDetectionDirectedGraph(){
        int n = 5;
        int[][] edges = {{2, 1}, {3, 2}, {3, 1}, {2, 4}, {4, 5}, {5, 3}};
        for (int i = 1; i <= n; i++)
            graph.addVertex(i);

        for (int[] edge : edges)
            graph.addEdge(edge[0], edge[1], true);
        boolean[] visited = new boolean[n + 1];//by default false if using Boolean object then use Arrays.fill with false
        boolean[] callStack = new boolean[n + 1];
        for(int i =1; i<=n && visited[i]==false; i++){
            if(dfs(i, visited, callStack)) {
                log.info("Cycle found for node - {}", i);
                return;
            }
        }
        log.info("Cycle not found for any node");
    }

    public boolean dfs(int node, boolean[] visited, boolean[] callStack) {
        visited[node] = true;
        callStack[node] = true;
        for (int nbr : (List<Integer>) graph.getNeighbours(node)) {
            if (visited[nbr] && callStack[nbr]) return true;
            else if (!visited[nbr])
                if (dfs(nbr, visited, callStack)) return true;
        }
        callStack[node] = false;
        return false;
    }


    /**CycleDetectionUndirectedGraph
     *
     */
    @Test
    public void cycleDetectionUndirectedGraph(){
            int n = 5;
            int[][] edges = {{1, 2}, {1, 3}, {1, 4}, {4, 5}, {2, 4}};
            for (int i = 1; i <= n; i++)
                graph.addVertex(i);
            for (int[] edge : edges)
                graph.addEdge(edge[0], edge[1], false);

            log.info("Cycle Present : {}", containsCycle());

        }

        public  boolean containsCycle() {
            List<Integer> visited = new ArrayList<>();
            return dfs(1, visited, -1);
        }

        public  <T> boolean dfs(T node, List<T> visited, T parent) {
            visited.add(node);
            for (T nbr : (List<T>) graph.getAdjVertices().get(node)) {
                if (!visited.contains(nbr)) {
                    if (dfs(nbr, visited, node)) return true;
                } else if (nbr != parent)
                    return true;
            }
            return false;
        }

    /**RedundantConnection
     *
     */
    @Test
    public void redundantConnection(){
        int [][] edges = {{1,2},{1,3},{2,3}};
        int n = edges.length;
        for(int i =1; i<=n ; i++)
            graph.addVertex(i);
        for(int[] edge : edges){
            List<Integer> visited = new ArrayList<>();
            if(dfs(edge[0], visited, -1, edge[1]))//check connection or cycle detection
                System.out.println(edge[0] +" , "+edge[1]);
            else
                graph.addEdge(edge[0], edge[1], false);
        }
        System.out.println("null");
    }

    public    boolean dfs(int node , List<Integer> visited, int parent, int dest){
        visited.add(node);
        for(int nbr :(List<Integer>) graph.getAdjVertices().get(node)){
            if(nbr ==dest && nbr != parent){
                return true;
            }
            else if(!visited.contains(nbr)){
                boolean connected = dfs(nbr, visited, node, dest);
                if(connected) return true;
            }
        }
        return false;
    }

}