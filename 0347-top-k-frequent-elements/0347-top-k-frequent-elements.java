class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map.toString());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        int[] res = new int[k];
        int i = 0;
        while (i < k) {
            res[i] = pq.poll();
            i++;
        }

        return res;
    }
}