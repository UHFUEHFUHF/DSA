import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer , Integer>> pq = new PriorityQueue<>((a , b) -> a.getValue() - b.getValue());

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            pq.offer(entry);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] answer = new int[k];
        for(int i = k - 1; i >= 0; i--){
            answer[i] = pq.poll().getKey();
        }

        return answer;
    }
}