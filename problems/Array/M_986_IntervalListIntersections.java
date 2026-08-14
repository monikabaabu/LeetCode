class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<firstList.length && j< secondList.length){
            // if(firstList[i][1]>=secondList[j][0]) {
            //     list.add(new int[]{secondList[j][0],firstList[i][1]});
            //     i++;

            // }
            // if(i<firstList.length && firstList[i][0]<=secondList[j][1]){
            //     list.add(new int[]{firstList[i][0],secondList[j][1]});

            // }

            // j++;
            int start = Math.max(firstList[i][0],secondList[j][0]);
            int end = Math.min(firstList[i][1],secondList[j][1]);
            if(start<=end) list.add(new int[]{start, end});
            if(firstList[i][1]>=secondList[j][1]) j++;
            else i++;
        }
        int[][] arr = list.toArray(new int[0][]);
        return arr;
    }
}