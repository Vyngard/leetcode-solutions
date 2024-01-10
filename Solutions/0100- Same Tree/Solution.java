class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        else if (p.val != q.val)
            return false;


//        var left = isSameTree(p.left, q.left);
//        if (!left)
//            return false;
//
//        var right = isSameTree(p.right, q.right);
//        if (!right)
//            return false;
//
//        return true;

        // you can write the line instead of previous lines
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}