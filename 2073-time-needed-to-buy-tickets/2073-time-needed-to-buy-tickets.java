class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        Queue<Integer> q = new LinkedList<>();
        int countTime = 0;
        for(int i=0; i<t.length; i++){
            q.add(i);
        }

        while(t[k] != 0){
            if(t[q.peek()] == 0){
                q.remove();
            }
            else{
                t[q.peek()]--;
                int n = q.peek();
                q.remove();
                q.add(n);
                countTime++;
            }
        }

        return countTime;
    }
}