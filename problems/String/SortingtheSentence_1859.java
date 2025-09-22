class Solution {
    public String sortSentence(String s) {
        String[] st = s.split(" ");
        String[] arr = new String[st.length];
        for(int i=0;i<st.length;i++){
            int index = st[i].charAt(st[i].length() - 1) - '1';
            String word = st[i].substring(0,st[i].length()-1);
            arr[index] = word;
        }

        return String.join(" ",arr);
    }

}
