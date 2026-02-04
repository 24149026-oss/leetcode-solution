// Last updated: 2/4/2026, 9:26:55 PM
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int l = 1, a = 1;
        long maxSum = Long.MIN_VALUE;
        while (!q.isEmpty()) {
            int s = q.size();
            long sum = 0;
            for (int i = 0; i < s; i++) {
                TreeNode n = q.poll();
                sum += n.val;
                if (n.left != null) q.offer(n.left);
                if (n.right != null) q.offer(n.right);
            }
            if (sum > maxSum) {
                maxSum = sum;
                a = l;
            }
            l++;
        }
        return a;
    }
}