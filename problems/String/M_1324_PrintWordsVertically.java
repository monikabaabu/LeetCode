class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        String[] arr = s.split(" ");
        int max =0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i].length());
        }
        for(int i=0;i<max;i++){
            StringBuilder sb = new StringBuilder();
            int lastChar = -1;
            for(int j=0;j<arr.length;j++){
                if(i>=arr[j].length()){
                    sb.append(" ");
                }
                else{
                    sb.append(arr[j].charAt(i));
                    lastChar = sb.length() - 1;
                }
            }
            list.add(sb.substring(0, lastChar + 1));
        }
        return list;
    }
}