class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();

        String[] arr = title.split(" ");
        for(int i=0;i<arr.length;i++){

            if(arr[i].length()<=2){
                sb=sb.append(arr[i].toLowerCase());
            }
            else{
                sb = sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1).toLowerCase());
            }
            if(i<arr.length-1){
                sb = sb.append(" ");
            }
        }
        return sb.toString();
    }

}