class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        int n = deck.length;
        int[] res = new int[n];

        Arrays.sort(deck);
        
        for(int i=0; i<n; i++){
            q.add(i);
        }

        for(int card : deck){
            int idx = q.poll();
            res[idx] = card;

            q.add(q.poll());
            
        }

        return res;
    }
}