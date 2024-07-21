# [1110. Delete Nodes And Return Forest](https://leetcode.com/problems/delete-nodes-and-return-forest)

[中文文档](/solution/1100-1199/1110.Delete%20Nodes%20And%20Return%20Forest/README.md)

## Description

<p>Given the <code>root</code> of a binary tree, each node in the tree has a distinct value.</p>

<p>After deleting all nodes with a value in <code>to_delete</code>, we are left with a forest (a disjoint union of trees).</p>

<p>Return the roots of the trees in the remaining forest. You may return the result in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/1100-1199/1110.Delete%20Nodes%20And%20Return%20Forest/images/screen-shot-2019-07-01-at-53836-pm.png" style="width: 237px; height: 150px;" />
<pre>
<strong>Input:</strong> root = [1,2,3,4,5,6,7], to_delete = [3,5]
<strong>Output:</strong> [[1,2,null,4],[6],[7]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [1,2,4,null,3], to_delete = [3]
<strong>Output:</strong> [[1,2,4]]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the given tree is at most <code>1000</code>.</li>
	<li>Each node has a distinct value between <code>1</code> and <code>1000</code>.</li>
	<li><code>to_delete.length &lt;= 1000</code></li>
	<li><code>to_delete</code> contains distinct values between <code>1</code> and <code>1000</code>.</li>
</ul>

## Solutions

first of all you create a Map (dictionary) to add all the nodes that are to be deleted. You do this so that for searching the item, you can do it in `O(1)`. then you create a dfs function that check for all the children nodes of a root. if either of those children among the `to_delete` numbers, you return `false` which means you have to delete the node and separate its children into new trees and add them to the `answer`. if the node is not in the `to_delete` list, you return `true` which means you have to keep the node and its children. you do this for all the children. but there is a catch. you have to check for the tree root itself. if the root is in the `to_delete` list, you have to add it to the `answer` as well. and finally you return the `answer` list.