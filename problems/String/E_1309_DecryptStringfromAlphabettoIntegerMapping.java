class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                sb.append((char) (num - 1 + 'a'));
                i += 3;
            } else {
                int num = s.charAt(i) - '0';
                sb.append((char) (num - 1 + 'a'));
                i++;
            }
        }
        return sb.toString();
    }
}
