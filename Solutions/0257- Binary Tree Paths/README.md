# [257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths)

## Description

<p>Given the <code>root</code> of a binary tree, return <em>all root-to-leaf paths in <strong>any order</strong></em>.</p>

<p>A <strong>leaf</strong> is a node with no children.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0200-0299/0257.Binary%20Tree%20Paths/images/paths-tree.jpg" style="width: 207px; height: 293px;" />
<pre>
<strong>Input:</strong> root = [1,2,3,null,5]
<strong>Output:</strong> [&quot;1-&gt;2-&gt;5&quot;,&quot;1-&gt;3&quot;]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [&quot;1&quot;]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 100]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

## Solutions
1) provided in Solution1.java: you can use iteration. so you need to consider a `Queue` to keep track of the nodes that you are visiting. also you will have `tempArray` to keep track of the path that you are visiting. in each iteration if the node that you are visiting doesn't have left or right child, in means that you are visiting a leaf node, so you need to add the path to the `answer` list, otherwise you need to extract the previous path from `tempArray` and create a separate `String` for left and separate `String` for right child and add them to the `tempArray`. also at the same time you should add those nodes to your `Queue` so that you can visit them later.      
2) provided in Solution2.java: you can do the exact same thing using recursion.