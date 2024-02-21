# [41. First Missing Positive](https://leetcode.com/problems/first-missing-positive)

<!-- tags:Array,Hash Table -->

## Description

<p>Given an unsorted integer array <code>nums</code>, return the smallest missing positive integer.</p>

<p>You must implement an algorithm that runs in <code>O(n)</code> time and uses <code>O(1)</code> auxiliary space.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,0]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The numbers in the range [1,2] are all in the array.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,4,-1,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> 1 is in the array but 2 is missing.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [7,8,9,11,12]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The smallest positive integer 1 is missing.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

## Solutions
1) provided in Python code: you sort the array. then find the index of the first element that is positive and save it in `index`. then start iterating through the array, from `index` and check if the current element is `1` or not. if it is, then move to the next item and check if it is `2` or not. you do this until you reach the end. now if you can't find the answer there are two possibility. a) the array doesn't have positive item at all, so if the last item is negative, you simply return `1`. b) the array has positive items and all of them exist. so the answer the the last item + 1.      
2) provided in Java code: you can use `in-place swap` for this. you iterate through the array and for each item, you swap it with the item at the index of the item - 1. for example, if the current item is `3`, you swap it with the item at index `2`. then you iterate through the array again and check if the current item is equal to its index + 1. if not, then the answer is the index + 1. if you reach the end of the array, then the answer is the length of the array + 1.