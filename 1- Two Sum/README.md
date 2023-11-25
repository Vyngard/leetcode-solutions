# [1. Two Sum](https://leetcode.com/problems/two-sum)

## Description

<p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>

<p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>

<p>You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><strong>Only one valid answer exists.</strong></li>
</ul>   

<p>&nbsp;</p>
  

## Solution
We can use HashTable (Dictionary). The `key` is the number in the array, and the `value` is the index of the number. We can iterate the array and check if `(target - currentNumber)` is in the HashTable. If it is, we can return the index of the `currentNumber` and the index of the `(target - currentNumber)`. If not, we can add the `currentNumber` and its index to the HashTable.  

For exmple in `[2,7,11,15]` we get the first item `2` and put it the HashTable. Then for next item which is `7`, since we have `HashTable[9-7]`, then we have the answer. So we print the index of `9-7=2` (which is the value in the HashTable) and the index of the current item which is `7`.

The time complexity is O(n) and the space complexity is O(n) as well.

