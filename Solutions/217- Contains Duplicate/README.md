# [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate)

## Description

<p>Given an integer array <code>nums</code>, return <code>true</code> if any value appears <strong>at least twice</strong> in the array, and return <code>false</code> if every element is distinct.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,1]
<strong>Output:</strong> true
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> false
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [1,1,1,3,3,4,3,2,4,2]
<strong>Output:</strong> true
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>


## Solution
you just have to use set in order to check the duplicates. iterate the array and add the elementa if not existed in the set. if it doesn, then immediately return `true`. after the loop, return `false` because there is no duplicates. Time complexity is O(n) and space complexity is O(n) as well.   
You can also sort the array and check the elements too, but the time complexity will be O(nlogn), which is slower. but on the other hand the space complexity will be O(1).