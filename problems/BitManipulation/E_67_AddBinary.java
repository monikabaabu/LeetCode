class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int n1=a.length()-1;
        int n2=b.length()-1;
        int car=0;
        while(n1>=0 || n2>=0 || car==1){
            if(n1>=0){
                car+=a.charAt(n1--)-'0';
            }
            if(n2>=0){
                car+=b.charAt(n2--)-'0';
            }
            sb.append(car%2);
            car/=2;
        }
        return sb.reverse().toString();

    }
}