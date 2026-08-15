// Last updated: 15/08/2026, 10:06:26
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        Stack<TreeNode> st1 = new Stack<>();
19        Stack<TreeNode> st2 = new Stack<>();
20        List<Integer> list = new ArrayList<>();
21
22        if (root == null) {
23            return list;
24        }
25
26        st1.push(root);
27
28        while (!st1.isEmpty()) {
29            TreeNode node = st1.pop();
30            st2.push(node);
31
32            if (node.left != null) {
33                st1.push(node.left);
34            }
35
36            if (node.right != null) {
37                st1.push(node.right);
38            }
39        }
40
41        while (!st2.isEmpty()) {
42            list.add(st2.pop().val);
43        }
44
45        return list;
46    }
47}