// Last updated: 25/09/2026, 10:00:43
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next=head;
15        ListNode curr=dummy;
16        while(curr.next!=null && curr.next.next!=null){
17            ListNode first=curr.next;
18            ListNode second=curr.next.next;
19            first.next=second.next;
20            curr.next=second;
21            second.next=first;
22            curr=first;
23        }
24        return dummy.next;
25    }
26}