# [7. Reverse Integer](https://leetcode.com/problems/reverse-integer)

## Description

<p>Given a signed 32-bit integer <code>x</code>, return <code>x</code><em> with its digits reversed</em>. If reversing <code>x</code> causes the value to go outside the signed 32-bit integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then return <code>0</code>.</p>

<p><strong>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</strong></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> x = 123
<strong>Output:</strong> 321
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> x = -123
<strong>Output:</strong> -321
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> x = 120
<strong>Output:</strong> 21
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-2<sup>31</sup> &lt;= x &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

## Solution
the main part is easy. you just create another variable, and in each iteration you add the last digit of `x` to the new variable and remove it from `x`. but there is an edge case that you should consider. before adding the last digit to the new variable, you should check if adding it will cause an overflow or not. if does you return `0` as requested.  
For time complexity, The number of digits in an integer n is given by $O(\log x)$ (assuming n is a decimal number). Thus, the time complexity of the loop is O(log n), where n is the absolute value of the input integer x. The space complexity is O(1).