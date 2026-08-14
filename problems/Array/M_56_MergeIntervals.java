class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        if(intervals.length==1) return intervals;
        int[] curr = intervals[0];
        int r =1;
        while(r<intervals.length){

            if(curr[1] >= intervals[r][0]){
                curr[1] = Math.max(curr[1], intervals[r][1]);
            }
            else{
                list.add(curr);
                curr = intervals[r];
            }
            r++;
        }
        list.add(curr);
        return list.toArray(new int[0][]);
    }
}