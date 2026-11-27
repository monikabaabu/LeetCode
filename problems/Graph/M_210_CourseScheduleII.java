class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }


        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
        }


        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }


        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int count = 0;
        int[] order = new int[numCourses];

        while (!q.isEmpty()) {

            int node = q.poll();
            order[count] = node;
            count++;

            for (int neighbor : adj.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }

        if(count == numCourses) return order;
        return new int[0];
    }
}