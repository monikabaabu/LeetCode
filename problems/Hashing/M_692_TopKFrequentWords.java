class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
                (a,b)->{
                    int freq = Integer.compare(map.get(a),map.get(b));
                    if(freq!=0) return freq;
                    return b.compareTo(a);
                }
        );
        for(String s : map.keySet()){
            pq.offer(s);
            while(pq.size()>k) pq.poll();

        }
        List<String> list = new ArrayList<>();
        while(!pq.isEmpty()) list.add(pq.poll());
        Collections.reverse(list);
        return list;
    }
}