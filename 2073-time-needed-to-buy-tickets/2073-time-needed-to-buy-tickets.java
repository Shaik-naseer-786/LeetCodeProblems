class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int totalTime = 0;
        boolean[] finished = new boolean[n];
        
        
        while (!finished[k]) {
            for (int i = 0; i < n; i++) {
                
                if (tickets[i] > 0) {
                    
                    tickets[i]--;
                    totalTime++;
                    
                    
                    if (i == k && tickets[i] == 0) {
                        finished[k] = true;
                    }
                }
            }
        }
        
        return totalTime;
    }
}
