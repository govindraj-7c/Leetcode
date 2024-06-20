class Solution {

    private boolean possibleToPlace(int force, int[] positions, int m){
        int prev = positions[0];
        int countBalls = 1;

        for(int i=1; i<positions.length; i++){
            int curr = positions[i];

            if((curr-prev) >= force){
                countBalls++;
                prev = curr;
            }
            if(countBalls == m){
                break;
            }
        }

        return countBalls == m;
    }

    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int minForce = 1;
        int maxForce = position[n-1] - position[0];
        int result = 0;

        while(minForce <= maxForce){
            int mid = minForce + (maxForce - minForce)/2;

            if(possibleToPlace(mid, position, m)){
                result = mid;
                minForce = mid+1;
            }
            else{
                maxForce = mid-1;
            }
        }

        return result;
    }
}