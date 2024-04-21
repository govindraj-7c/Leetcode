class Solution {
    class Pair{
        int src;
        int dest;

        public Pair(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int m = edges.length;
        ArrayList<Pair>[] graph = new ArrayList[n];

        if(n==1) return true;

        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            graph[edges[i][0]].add(new Pair(edges[i][0], edges[i][1]));
            graph[edges[i][1]].add(new Pair(edges[i][1], edges[i][0]));
        }

        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            Pair p = graph[i].get(i);
            if(!visited[p.src]){
                return dfs(graph, source, destination, visited);
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<Pair>[] graph, int src, int dest, boolean[] visited){
        visited[src] = true;
        if(src == dest){
            return true;
        }

        for(int i=0; i<graph[src].size(); i++){
            Pair p = graph[src].get(i);
            if(!visited[p.dest]){
                boolean ans = dfs(graph, p.dest, dest, visited);
                if(ans) return true;
            }
        }

        return false;
    }
}