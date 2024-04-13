class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int i=0; i<n; i++){
            if(stack.isEmpty()){
                left[i] = 0;
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                if(stack.isEmpty()) left[i] = 0;
                else left[i] = stack.peek() + 1;

                stack.push(i);
            }
        }

        while(!stack.isEmpty()) stack.pop();

        for(int i = n-1; i>=0; i--){
            if(stack.isEmpty()){
                right[i] = n-1;
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                if(stack.isEmpty()) right[i] = n-1;
                else right[i] = stack.peek() - 1;

                stack.push(i);
            }
        }

        for(int i=0; i<n; i++){
            int temp = (right[i] - left[i] + 1) * heights[i];
            ans = Math.max(ans, temp);
        }

        return ans;
    }
}