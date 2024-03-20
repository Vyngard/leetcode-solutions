# [1669. Merge In Between Linked Lists](https://leetcode.com/problems/merge-in-between-linked-lists)

<!-- tags:Linked List -->

## Description

<p>You are given two linked lists: <code>list1</code> and <code>list2</code> of sizes <code>n</code> and <code>m</code> respectively.</p>

<p>Remove <code>list1</code>&#39;s nodes from the <code>a<sup>th</sup></code> node to the <code>b<sup>th</sup></code> node, and put <code>list2</code> in their place.</p>

<p>The blue edges and nodes in the following figure indicate the result:</p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/1600-1699/1669.Merge%20In%20Between%20Linked%20Lists/images/fig1.png" style="height: 130px; width: 504px;" />
<p><em>Build the result list and return its head.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/1600-1699/1669.Merge%20In%20Between%20Linked%20Lists/images/ll.png" style="width: 609px; height: 210px;" />
<pre>
<strong>Input:</strong> list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
<strong>Output:</strong> [10,1,13,1000000,1000001,1000002,5]
<strong>Explanation:</strong> We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/1600-1699/1669.Merge%20In%20Between%20Linked%20Lists/images/merge_linked_list_ex2.png" style="width: 463px; height: 140px;" />
<pre>
<strong>Input:</strong> list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
<strong>Output:</strong> [0,1,1000000,1000001,1000002,1000003,1000004,6]
<strong>Explanation:</strong> The blue edges and nodes in the above figure indicate the result.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= list1.length &lt;= 10<sup>4</sup></code></li>
	<li><code>1 &lt;= a &lt;= b &lt; list1.length - 1</code></li>
	<li><code>1 &lt;= list2.length &lt;= 10<sup>4</sup></code></li>
</ul>

## Solutions
we consider two pointers. `pointer1` and `pointer2`. `pointer1` is used to find the `a`th node and `pointer2` is used to find the `b`th node. Then we connect the `pointer1` to the head of `list2`. then we move the `pointer1` to the end of the list and then connect the end to the `pointer2`'s next node. with this method, we remove the nodes from `a` to `b` and put `list2` in their place.