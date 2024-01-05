# [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list)

## Description

<p>Given the <code>head</code> of a singly linked list, return <code>true</code><em> if it is a </em><span data-keyword="palindrome-sequence"><em>palindrome</em></span><em> or </em><code>false</code><em> otherwise</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0200-0299/0234.Palindrome%20Linked%20List/images/pal1linked-list.jpg" style="width: 422px; height: 62px;" />
<pre>
<strong>Input:</strong> head = [1,2,2,1]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0200-0299/0234.Palindrome%20Linked%20List/images/pal2linked-list.jpg" style="width: 182px; height: 62px;" />
<pre>
<strong>Input:</strong> head = [1,2]
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is in the range <code>[1, 10<sup>5</sup>]</code>.</li>
	<li><code>0 &lt;= Node.val &lt;= 9</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you do it in <code>O(n)</code> time and <code>O(1)</code> space?

## Solutions
You have two ways.   
1) (provided in Java code) you can iteratee through linkedlist and save the value in array. then use two pointers to check if it is palindrome. this way is easier but since you are using an array the space complexity is O(n).    
2) (Provided in Pyton) you use the slow and fast pointer in the linkedlist. when fast pointer reaches the end, the slow pointer will be in the middle. then you reverse the second half of the linkedlist and compare it with the first half. this way you don't need to use extra space. the time complexity is O(n) and space complexity is O(1).