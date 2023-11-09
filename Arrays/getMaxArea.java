public class getMaxArea {
    public static long getMaxArea(long hist[], long n) 
    {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> stk = new Stack<>();
        int[] next = new int[hist.length];
        int[] prev = new int[hist.length];
        st.push(-1);
        
        //next smaller
        for(int i=hist.length-1;i>=0;i--){
            while(st.peek()!=-1 && hist[st.peek()]>= hist[i]) st.pop();
            next[i]=st.peek();
            st.push(i);
        }
        //prev smaller
        stk.push(-1);
        for(int i=0;i<hist.length;i++){
            while(stk.peek()!=-1 && hist[stk.peek()]>= hist[i]) stk.pop();
            prev[i]=stk.peek();
            stk.push(i);
        }
        //final
        long ans= Long.MIN_VALUE;
        for(int i=0;i<hist.length;i++){
            if(next[i]== -1) next[i]=hist.length;
            ans = Math.max((next[i]-prev[i]-1)* hist[i],ans);
        }      
        return ans;
    }
        
}


