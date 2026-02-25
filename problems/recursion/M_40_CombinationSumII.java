class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        combination(candidates,set, list,target,0);
        return set;
    }
    private static void combination(int[] c, List<List<Integer>> s, List<Integer> l, int t,int i ){
        if(t==0){
            s.add(new ArrayList<>(l));
            return ;
        }
        for(int j=i;j< c.length;j++){
            if(j>i && c[j]==c[j-1]){
                continue;
            }
            if(c[j]>t){
                break;
            }
            l.add(c[j]);
            combination(c,s,l,t-c[j],j+1);
            l.remove(l.size() - 1);



        }
    }
}

//or

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combination(candidates,set, list,target,0);
        return set;
    }
    private static void combination(int[] c, List<List<Integer>> s, List<Integer> l, int t,int i ){

        if (t == 0) {
            s.add(new ArrayList<>(l));
            return;
        }

        if (i == c.length || t < 0) {
            return;
        }

        l.add(c[i]);
        combination(c,s,l,t-c[i],i+1);
        l.remove(l.size() - 1);
        while(i+1<c.length && c[i]==c[i+1]){
            i++;
        }
        combination(c,s,l,t,i+1);

    }
}
