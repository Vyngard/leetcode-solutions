# [23. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists)


## Description

<p>You are given an array of <code>k</code> linked-lists <code>lists</code>, each linked-list is sorted in ascending order.</p>

<p><em>Merge all the linked-lists into one sorted linked-list and return it.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> lists = [[1,4,5],[1,3,4],[2,6]]
<strong>Output:</strong> [1,1,2,3,4,4,5,6]
<strong>Explanation:</strong> The linked-lists are:
[
  1-&gt;4-&gt;5,
  1-&gt;3-&gt;4,
  2-&gt;6
]
merging them into one sorted list:
1-&gt;1-&gt;2-&gt;3-&gt;4-&gt;4-&gt;5-&gt;6
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> lists = []
<strong>Output:</strong> []
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> lists = [[]]
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>k == lists.length</code></li>
	<li><code>0 &lt;= k &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= lists[i].length &lt;= 500</code></li>
	<li><code>-10<sup>4</sup> &lt;= lists[i][j] &lt;= 10<sup>4</sup></code></li>
	<li><code>lists[i]</code> is sorted in <strong>ascending order</strong>.</li>
	<li>The sum of <code>lists[i].length</code> will not exceed <code>10<sup>4</sup></code>.</li>
</ul>

## Solutions
1) (provided in the Solution1.java): you check the first element in the list, add all its nodes to the new list. then move to the second element in the list, and add its nodes to a proper place in the new list. and so on. for that you need to iterate the new list each time you check a new element in the list. Because of that the time complexity is `O(N * k)` where k is the number of items in the list. it is not sufficient but the space complexity is `O(1)`    
2) (provided in the Solution2.java): you can use a priority queue to store the first node of each list. then you can poll the smallest node from the queue and add it to the new list. then you can add the next node of of that listto the queue and continue to do that until the queue is empty. the time complexity is `O(N * log(k))` where k is the number of items in the list. and the space complexity is `O(k)` because of the priority queue.