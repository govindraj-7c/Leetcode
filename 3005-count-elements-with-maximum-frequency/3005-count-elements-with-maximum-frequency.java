class Solution {
    public int maxFrequencyElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == -1) continue;
            int count = 1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    nums[j] = -1;
                }
            }
            list.add(count);
        }
        int[] freq = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            freq[i] = list.get(i);
        }
        Arrays.sort(freq);
        int max = freq[freq.length-1];
        int temp = freq[freq.length-1];
        for(int i=0; i<freq.length-1; i++){
            if(freq[i] == temp) max += freq[i];
        }
        return max;
    }
}