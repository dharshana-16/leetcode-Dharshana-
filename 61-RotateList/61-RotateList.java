// Last updated: 11/08/2026, 16:10:51
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || head.next == null || k== 0){
            return head;
        }
        ListNode node = head.next;
        int steps;
        for(steps = 1; node.next != null; ++steps){
            node = node.next;
        }
        int n= steps+1;
        k= n - (k % n);
        if(k == n) return head;
        node.next = head;
        while(k>0){
            node = node.next;
            k--;
        }
        head = node.next;
        node.next = null;
        return head;
    }
}