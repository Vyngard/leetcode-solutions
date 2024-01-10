# [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree)

## Description

<p>Given the <code>root</code> of a binary tree, <em>check whether it is a mirror of itself</em> (i.e., symmetric around its center).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0100-0199/0101.Symmetric%20Tree/images/symtree1.jpg" style="width: 354px; height: 291px;" />
<pre>
<strong>Input:</strong> root = [1,2,2,3,4,4,3]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0100-0199/0101.Symmetric%20Tree/images/symtree2.jpg" style="width: 308px; height: 258px;" />
<pre>
<strong>Input:</strong> root = [1,2,2,null,3,null,3]
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 1000]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you solve it both recursively and iteratively?

## Solutions
1- Recursive (which is provided in Java): the only catch in here is that you should use overloading. you create another function that accepts two trees and pass the root to it. then simultaneously check the left and right subtrees of the root. if they are equal, then check the left subtree of the left subtree with the right subtree of the right subtree and the right subtree of the left subtree with the left subtree of the right subtree. if they are equal, then the tree is symmetric.   
2- Iterative (which is provided in Python): you should use a stack to store the nodes. in each iteration you should save the left node of current node, and right node of current node. then you check them if they are equal or not. then move to the next nodes. but be careful, if you move to the left node of the current node, you should move to the right node of other node too. and vice versa.    
Since you are checking all the nodes, the time complexity is `O(n)`. and since you are using a stack to store the nodes, the space complexity is `O(n)` too. but  in the recursive solution, since you are not using any stack, the space complexity is `O(1)`.