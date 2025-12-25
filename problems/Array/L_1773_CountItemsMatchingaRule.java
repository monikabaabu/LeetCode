class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key=0;
        int count=0;
        switch(ruleKey){
            case "type": key=0; break;
            case "color": key=1; break;
            case "name" : key=2; break;
        }
        for(List<String> item: items){
            if(item.get(key).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}