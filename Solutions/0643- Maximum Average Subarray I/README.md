# [643. Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i)

## Description

<p>You are given an integer array <code>nums</code> consisting of <code>n</code> elements, and an integer <code>k</code>.</p>

<p>Find a contiguous subarray whose <strong>length is equal to</strong> <code>k</code> that has the maximum average value and return <em>this value</em>. Any answer with a calculation error less than <code>10<sup>-5</sup></code> will be accepted.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,12,-5,-6,50,3], k = 4
<strong>Output:</strong> 12.75000
<strong>Explanation:</strong> Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [5], k = 1
<strong>Output:</strong> 5.00000
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= k &lt;= n &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>


## Solution
imagine that we have `[1,2,3,4,5,6]` and `k = 3`. so first we add `[1,2,3]` and find the average and then we add `[2,3,4]` and then find the average again. as you can see the `[2,3]` has overlap in these two equation. so we don't have to consider them again. for this reason we just need to remove the first element of the previous subarray (which is `nums[i - 1]`) and add the last element of the current subarray (which is `nums[i + k - 1]`). this process will continue until we reach the end of the array. Also we don't need to divide the answer each time, since the biggest average is equal to the biggest sum of the elements. so if we find the biggest sum, we find the biggest average too.   
For time complexity, since we have to check `nums.length - k` subarrays, in worse case scenario, we have `O(n)`. Also the space complexity is `O(1)`.