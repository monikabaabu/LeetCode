class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] deg = new int[graph.length];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < graph.length; i++) {
            for (int n : graph[i]) {
                adj.get(n).add(i);
                deg[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<deg.length;i++){
            if(deg[i]==0) q.offer(i);
        }
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);
            for (int n : adj.get(node)){
                deg[n]--;
                if(deg[n]==0) q.offer(n);
            }
        }
        Collections.sort(list);
        return list;
    }
}