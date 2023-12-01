# [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists)

## Description

<p>You are given the heads of two sorted linked lists <code>list1</code> and <code>list2</code>.</p>

<p>Merge the two lists into one <strong>sorted</strong> list. The list should be made by splicing together the nodes of the first two lists.</p>

<p>Return <em>the head of the merged linked list</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0000-0099/0021.Merge%20Two%20Sorted%20Lists/images/merge_ex1.jpg" style="width: 662px; height: 302px;" />
<pre>
<strong>Input:</strong> list1 = [1,2,4], list2 = [1,3,4]
<strong>Output:</strong> [1,1,2,3,4,4]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> list1 = [], list2 = []
<strong>Output:</strong> []
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> list1 = [], list2 = [0]
<strong>Output:</strong> [0]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in both lists is in the range <code>[0, 50]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
	<li>Both <code>list1</code> and <code>list2</code> are sorted in <strong>non-decreasing</strong> order.</li>
</ul>

## Solution
There are two ways for that:  
1- Iterative (which i implemeneted it in java): in this method, we have two pointers, one for each list, and we compare the values of the nodes that the pointers are pointing to. Then we add the smaller one to the new list and move the pointer to the next node. We do this until we reach the end of one of the lists. Then we add the rest of the other list to the new list.   
2- Recursive (which i implemented it in python): if the head of one list is less than the head of the other one, we attach that head to the sorted linked list of our remaining list (that we can achieve using recursive.) by using this method, in each recursive call we are sure that the head of the list is the smallest value in that list. So we can easily attach it to the sorted list. We do this until we reach the end of one of the lists. Then we attach the rest of the other list to the sorted list.