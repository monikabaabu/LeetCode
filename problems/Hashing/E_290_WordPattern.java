class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<pattern.length();i++){
            if(map1.containsKey(pattern.charAt(i)) && !map1.get(pattern.charAt(i)).equals(arr[i])) return false;
            if(map2.containsKey(arr[i]) && !map2.get(arr[i]).equals(pattern.charAt(i))) return false;
            map1.put(pattern.charAt(i),arr[i]);
            map2.put(arr[i],pattern.charAt(i));
        }
        return true;
    }
}