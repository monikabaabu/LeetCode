class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0;
        int r = s.length()-1;
        while(l<r){
            while(l<r && !isVowel(arr[l])){
                l++;
            }
            while(l<r&& !isVowel(arr[r])){
                r--;
            }
            char c = arr[l];
            arr[l]=arr[r];
            arr[r]=c;
            l++;
            r--;

        }
        return new String(arr);
    }
    private static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1 ;

    }
}