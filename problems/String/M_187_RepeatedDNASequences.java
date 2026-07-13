class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        // Map<String, Integer> map = new HashMap<>();
        Set<String> seen = new HashSet<>();
        Set<String> rep = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            //    map.put(s.substring(i,i+10),map.getOrDefault(s.substring(i,i+10), 0) + 1);
            if(seen.contains(s.substring(i,i+10))){
                rep.add(s.substring(i,i+10));
            }
            else{
                seen.add(s.substring(i,i+10));
            }
//         for (Map.Entry<String, Integer> entry : map.entrySet()) {
//     if (entry.getValue() > 1) {
//         list.add(entry.getKey());
//     }
        }
        return new ArrayList(rep);
    }
}