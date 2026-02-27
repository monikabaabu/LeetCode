class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();

        while(num>0){
            int bit = num & 1;
            sb.append(bit ^ 1);
            num>>=1;
        }
        String s = sb.reverse().toString();
        return Integer.parseInt(s,2);
    }
}