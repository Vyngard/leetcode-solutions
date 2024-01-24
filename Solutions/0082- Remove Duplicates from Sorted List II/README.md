# [82. Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii)

## Description

<p>Given the <code>head</code> of a sorted linked list, <em>delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list</em>. Return <em>the linked list <strong>sorted</strong> as well</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0000-0099/0082.Remove%20Duplicates%20from%20Sorted%20List%20II/images/linkedlist1.jpg" style="width: 500px; height: 142px;" />
<pre>
<strong>Input:</strong> head = [1,2,3,3,4,4,5]
<strong>Output:</strong> [1,2,5]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0000-0099/0082.Remove%20Duplicates%20from%20Sorted%20List%20II/images/linkedlist2.jpg" style="width: 500px; height: 205px;" />
<pre>
<strong>Input:</strong> head = [1,1,1,2,3]
<strong>Output:</strong> [2,3]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is in the range <code>[0, 300]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
	<li>The list is guaranteed to be <strong>sorted</strong> in ascending order.</li>
</ul>

## Solutions
1) (provided in Java code): in here you create another linkedlist which is empty. now you consider a pointer for your main linkedlist. you iterate through each item. if the item is equal to the next one, you keep going in the linkedlist until you reach the end of the duplicate item or you reach the end of the linkedlist. if the current item is not equal to the next one you just add it to the new linkedlist. you do this until you reach the end of the main linkedlist. then you return the new linkedlist.     
2) (provided in Python code): In here you should keep two pointers. one is for current node and the other for previous node. you should move the current node, as long as its value is equal to the next node's value. if the current node's value is not equal to the next node's value, the previous node should be linked to the current node. BUT the only catch here is that you shouldn't move the previous node yet, since it is possible that the next node's value is equal to the next next node's value. if this is not the case, then the current node won't move and will be equal to the previous node next value. in that case, you are allowed to move the previous node. do the calculation with `[1,2,3,3,4,4,5]` and you can see what I mean.