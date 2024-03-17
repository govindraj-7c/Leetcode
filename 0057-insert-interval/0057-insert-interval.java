class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int len = intervals.length;
        while(i<len){
            if(intervals[i][1] < newInterval[0]){
                res.add(intervals[i]);
            }
            else if(intervals[i][0] > newInterval[1]){
                break;
            }
            else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
            i++;
        }
        res.add(newInterval);
        while(i<len){
            res.add(intervals[i++]);
        }
        return res.toArray(new int[res.size()][2]);
    }
}