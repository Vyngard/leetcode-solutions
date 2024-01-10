# [152. Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray)

## Description

<p>Given an integer array <code>nums</code>, find a <span data-keyword="subarray-nonempty">subarray</span> that has the largest product, and return <em>the product</em>.</p>

<p>The test cases are generated so that the answer will fit in a <strong>32-bit</strong> integer.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,3,-2,4]
<strong>Output:</strong> 6
<strong>Explanation:</strong> [2,3] has the largest product 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [-2,0,-1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> The result cannot be 2, because [-2,-1] is not a subarray.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
	<li>The product of any prefix or suffix of <code>nums</code> is <strong>guaranteed</strong> to fit in a <strong>32-bit</strong> integer.</li>
</ul>

## Solutions

There are some catches in here. first you should be careful about negative numbers as they can change the result, but also at the same time you should be careful how many negative numbers do you have (because if you have een number of negative numbers the result will be positive). also the other catch is having 0 in the array as it can completely destory the result. but also you should be careful as the 0 can be the result itself.   
lets solve it using an example. imagine you have `[2,3,0,-1]`. you set `min = 1` and `max = 1` and `answer = 0`. then for the first element, you multiply that to `min` and `max` which will be `temp_min = 2` and `temp_max = 2`. also you should check the result with the item itself and put the `max(temp_min, temp_max, item)` in `max` and put `min(temp_min, temp_max, item)` in `min`. so now `min = 2` and `max = 2`. then you put the `max(answer, max)` into `answer`, so we have `asnwer = 2`.    
now we check the second item. we have `temp_min = 6` and `temp_max = 6`. so `min = 2` and `max = 6`. and `answer = 6`.    
now we check the third item. since it is 0, then we set `min = 1` and `max = 1` as we don't want the 0 to compromise the next elements in the array.   
now we check the last item. `temp_min = -1` and `temp_max = -1`, so we have `min = -1` and `max = 1`. and `answer = 6`.   
so in the end we have our answer which is 6.    
the reason we keep track of `min` and `max` is that a negative number can change them. and also since we don't know how many negative numbers we have, so we have to keep track of the `min` and `max` in each iteration.    
For better understading you can see [this video](https://www.youtube.com/watch?v=lXVy6YWFcRM&ab_channel=NeetCode).