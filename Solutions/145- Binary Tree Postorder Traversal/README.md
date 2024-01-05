# [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal)

## Description

<p>Given the <code>root</code> of a&nbsp;binary tree, return <em>the postorder traversal of its nodes&#39; values</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0100-0199/0145.Binary%20Tree%20Postorder%20Traversal/images/pre1.jpg" style="width: 127px; height: 200px;" />
<pre>
<strong>Input:</strong> root = [1,null,2,3]
<strong>Output:</strong> [3,2,1]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of the nodes in the tree is in the range <code>[0, 100]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Recursive solution is trivial, could you do it iteratively?

## Solutions
In post-order you check the left node first, then the right node, then the root. there are two ways for that:
1) recursive (provided in Python code): you first recursively check the left node and right node and return their value as array and add them to the current array. then you add the root value to the array and return it.    
2) iteration (provided in Java code): this is a bit tricky. you should use a stack, but you are not allowed to remove the root node until you check both left and right node. in order for that you can have a set and keep the nodes that you checked. so for each node that you check, first you check if its left and right node are in the set or not. if not, you add them to the stack. then do this again. now if you check a node that its left and right node are in the set, you can add its value to the final array, then you can remove it from the stack and move to the next node.