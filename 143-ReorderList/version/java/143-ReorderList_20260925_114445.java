// Last updated: 25/09/2026, 11:44:45
1class Solution {
2    public void reorderList(ListNode head) {
3        ListNode slow = head;
4        ListNode fast = head;
5        while (fast != null && fast.next != null) {
6            slow = slow.next;
7            fast = fast.next.next;
8
9        }
10        ListNode curr = slow.next;
11        slow.next = null; 
12        ListNode prev = null;
13        ListNode next = null;
14        while (curr != null) {
15            next = curr.next;
16            curr.next = prev;
17            prev = curr;
18            curr = next;
19        }
20        ListNode lh = head;
21        ListNode rh = prev;
22        ListNode nxtL, nxtR;
23        while (lh != null && rh != null) {
24            nxtL = lh.next;
25            lh.next = rh;
26            nxtR = rh.next;
27            rh.next = nxtL;
28            rh = nxtR;
29            lh = nxtL;
30        }
31    }
32}