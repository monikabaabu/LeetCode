class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();

        for(int i=0;i<queries.length;i++){
            Boolean ans = false;
            int k=0;
            for(int j=0;j<queries[i].length();j++){
                if(k<pattern.length() && queries[i].charAt(j)== pattern.charAt(k) ){
                    k++;
                }
                else if(Character.isUpperCase(queries[i].charAt(j))){
                    ans = true;
                    break;
                }
            }
            if(ans || k< pattern.length()){
                list.add(false);
            }
            else{
                list.add(true);
            }
        }
        return list;
    }
}