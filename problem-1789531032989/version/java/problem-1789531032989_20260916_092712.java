// Last updated: 16/09/2026, 09:27:12
1class KthLargest {
2    private PriorityQueue<Integer> heap = new PriorityQueue<>();
3    private int k;
4
5    public KthLargest(int k, int[] nums) {
6        this.k = k;
7        for(var n : nums) add(n);
8    }
9    
10    public int add(int val) {
11        heap.offer(val);
12        if(heap.size() > k) heap.poll();
13        return heap.peek();
14    }
15}
16
17/**
18 * Your KthLargest object will be instantiated and called as such:
19 * KthLargest obj = new KthLargest(k, nums);
20 * int param_1 = obj.add(val);
21 */