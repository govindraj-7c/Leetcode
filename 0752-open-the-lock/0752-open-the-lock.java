class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> set = new HashSet<>();
        Queue<String> que = new LinkedList<>();
        int level = 0;

        for(String str : deadends){
            set.add(str);
        }

        String start = "0000";
        if(set.contains(start)) return -1;

        que.add(start);

        while(!que.isEmpty()){
            int n = que.size();

            while(n-- > 0){
                String curr = que.remove();
                
                if(curr.equals(target)){
                    return level;
                }

                fillNeighbors(que, new StringBuilder(curr), set);
            }
            level++;
        }
        return -1;
    }

    public void fillNeighbors(Queue<String> que, StringBuilder curr, HashSet<String> dead){
        for(int i=0; i<4; i++){
            char ch = curr.charAt(i);

            char inc = ch == '9' ? '0' : (char) (ch+1);
            char dec = ch == '0' ? '9' : (char) (ch-1);

            curr.setCharAt(i, inc);
            String strInc = curr.toString();
            if(!dead.contains(strInc)){
                dead.add(strInc);
                que.add(strInc);
            }

            curr.setCharAt(i, dec);
            String strDec = curr.toString();
            if(!dead.contains(strDec)){
                dead.add(strDec);
                que.add(strDec);
            }
            curr.setCharAt(i,ch);
        }
    }
}