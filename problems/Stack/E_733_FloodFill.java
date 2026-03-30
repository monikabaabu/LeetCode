class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int oldcolor = image[sr][sc];
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{sr,sc});
        int r = image.length;
        int c = image[0].length;
        while(!stack.isEmpty()){
            int curr[]= stack.pop();
            int cr = curr[0];
            int cc = curr[1];
            if(image[cr][cc]==oldcolor){
                image[cr][cc]=color;
                if(cr>0) stack.push(new int[]{cr-1,cc});
                if(cr<r-1) stack.push(new int[]{cr+1,cc});
                if(cc>0) stack.push(new int[]{cr,cc-1});
                if(cc<c-1) stack.push(new int[]{cr,cc+1});
            }

        }
        return image;
    }
}