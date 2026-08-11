// Last updated: 11/08/2026, 16:03:22
class RecentCounter {
    private ArrayDeque<Integer>q;
    public RecentCounter() {
        q=new ArrayDeque();
    }
    public int ping(int t) {
        q.offer(t);
        while(q.peek() < t-3000){
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */