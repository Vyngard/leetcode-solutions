# [501. Find Mode in Binary Search Tree](https://leetcode.com/problems/find-mode-in-binary-search-tree)

[中文文档](/solution/0500-0599/0501.Find%20Mode%20in%20Binary%20Search%20Tree/README.md)

<!-- tags:Tree,Depth-First Search,Binary Search Tree,Binary Tree -->


<p>Given the <code>root</code> of a binary search tree (BST) with duplicates, return <em>all the <a href="https://en.wikipedia.org/wiki/Mode_(statistics)" target="_blank">mode(s)</a> (i.e., the most frequently occurred element) in it</em>.</p>

<p>If the tree has more than one mode, return them in <strong>any order</strong>.</p>

<p>Assume a BST is defined as follows:</p>

<ul>
	<li>The left subtree of a node contains only nodes with keys <strong>less than or equal to</strong> the node&#39;s key.</li>
	<li>The right subtree of a node contains only nodes with keys <strong>greater than or equal to</strong> the node&#39;s key.</li>
	<li>Both the left and right subtrees must also be binary search trees.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0500-0599/0501.Find%20Mode%20in%20Binary%20Search%20Tree/images/mode-tree.jpg" style="width: 142px; height: 222px;" />
<pre>
<strong>Input:</strong> root = [1,null,2,2]
<strong>Output:</strong> [2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [0]
<strong>Output:</strong> [0]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 10<sup>4</sup>]</code>.</li>
	<li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).

## Solutions
### Solution1
1) Traversal Initiation: Begins with the root of the BST, performing an in-order traversal.
2) Value Comparison: As it traverses, it compares the current node value with the previous node's value. If they match, it increments the count for the current value; if not, it resets the count.
3) Mode Update: If the current count exceeds the known maximum, it updates the mode(s) list to only include the current value. If the count equals the maximum, it adds the current value to the modes list.
4) Result Compilation: After traversal, it converts the list of mode(s) into an array and returns it.
### Solution2
You can use `HashMap` to store the frequency of each value in the tree, then find the maximum frequency and return all the values that have the maximum frequency. This solution is not space efficient, but it is easy to implement. 