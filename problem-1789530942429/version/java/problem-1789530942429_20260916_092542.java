// Last updated: 16/09/2026, 09:25:42
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return CreateBST(nums, 0, nums.length -1);
19    }
20    private TreeNode CreateBST(int nums[], int l, int r){
21        if(l>r){
22            return null;
23        }
24        int mid = l + (r-l)/2;
25        TreeNode root = new TreeNode(nums[mid]);
26        root.left = CreateBST(nums, l, mid - 1);
27        root.right = CreateBST(nums, mid + 1, r);
28        return root;
29    }
30}