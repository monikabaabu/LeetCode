class Solution {
    public List<String> commonChars(String[] words) {
        int[] arr = new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for(String s : words){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            for (int i = 0; i < 26; i++) {
                arr[i] = Math.min(arr[i], count[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(String.valueOf((char) ('a' + i)));
            }
        }
        return list;
    }
}