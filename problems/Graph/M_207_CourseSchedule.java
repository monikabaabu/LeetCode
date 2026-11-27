class Solution {
    public boolean canFinish(int V, int[][] p) {
        int[] indegree = new int[V];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<p.length;i++){
            indegree[p[i][0]]++;
            adj.get(p[i][1]).add(p[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length ;i++){
            if(indegree[i] == 0) q.offer(i);
        }
        int c=0;
        while(!q.isEmpty()){
            int node = q.poll();
            c++;
            for(int n : adj.get(node)){
                indegree[n] --;
                if(indegree[n] == 0) q.offer(n);
            }
        }
        return c == V;
    }

}