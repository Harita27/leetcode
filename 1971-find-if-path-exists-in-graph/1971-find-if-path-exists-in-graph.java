class Solution {
    public boolean validPath(int v, int[][] edges, int source, int destination) {
          List<Integer>[] graph = new ArrayList[v];
    for (int i = 0; i < v; i++) graph[i] = new ArrayList<>();

    for (int[] edge : edges) {
        graph[edge[0]].add(edge[1]);
        graph[edge[1]].add(edge[0]);
    }

        boolean haspath=false;
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        boolean[] visited=new boolean[v];
        while(!q.isEmpty()){
            int n=q.poll();
            if(n==destination){
                return true;
            }
             if(!visited[n]){
                visited[n]=true;
           for (int neighbor : graph[n]) {
            if (!visited[neighbor]) {
                q.add(neighbor);
            }
           }
                
             }
        }
        return false;
    
    }
}