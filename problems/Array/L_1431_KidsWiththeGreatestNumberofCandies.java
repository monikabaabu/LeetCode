class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max=candies[0];
        for(int i=1; i< candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int candy:candies){
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}