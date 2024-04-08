class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int s = 0;
        for(int stud : students){
            queue.add(stud);
        }

        for(int i = sandwiches.length-1; i>=0; i--){
            stack.push(sandwiches[i]);
        }

        while(!queue.isEmpty() && s < queue.size()){
            if(queue.peek() == stack.peek()){
                queue.remove();
                stack.pop();
                s = 0;
            }

            else{
                queue.add(queue.peek());
                queue.remove();
                s++;
            }
        }

        return queue.size();
    }
}