class Solution {
    public boolean isPalindrome(int x) {
        String n = Long.toString(x);
        StringBuilder sb = new StringBuilder(n);
        sb = sb.reverse();
        String n2 = sb.toString();
        if(n.equals(n2)){
            return true;
        }
        return false;

    }
}