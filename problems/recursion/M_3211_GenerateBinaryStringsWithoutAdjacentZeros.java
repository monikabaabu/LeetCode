class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        string(n, "", list);
        return list;
    }

    private static void string(int n, String s, List<String> list) {
        if (s.length() == n) {
            list.add(s);
            return;
        }
        string(n, s + "1", list);
        if (s.length() == 0 || s.charAt(s.length() - 1) != '0') {
            string(n, s + "0", list);
        }

    }

}