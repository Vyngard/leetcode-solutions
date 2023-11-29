# [5. Palindrome Number](https://leetcode.com/problems/palindrome-number)

## Description

<p>Given an integer <code>x</code>, return <code>true</code><em> if </em><code>x</code><em> is a </em><span data-keyword="palindrome-integer"><em><strong>palindrome</strong></em></span><em>, and </em><code>false</code><em> otherwise</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> x = 121
<strong>Output:</strong> true
<strong>Explanation:</strong> 121 reads as 121 from left to right and from right to left.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> x = -121
<strong>Output:</strong> false
<strong>Explanation:</strong> From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> x = 10
<strong>Output:</strong> false
<strong>Explanation:</strong> Reads 01 from right to left. Therefore it is not a palindrome.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-2<sup>31</sup>&nbsp;&lt;= x &lt;= 2<sup>31</sup>&nbsp;- 1</code></li>
</ul>


## Solution
it's easy. You check half of the number and then compare it with the other half. If they are the same, then it's a palindrome number.
for example, image you have 121 or 1221. You consider `y` to save the other have. first you get `y = 1` and `y = 1`. Then drop this number from the main number, so we have `x = 12` and `x = 122` respectively.   
The you do the same, so we have `y = 12` and `y = 12` and `x = 1` and `x = 12` respectively. since now y is not less than x, now we should compare them. if they are the same, then it's a palindrome number (like second example). if they have different lenght then we drop the last digit of `y` and then compare them (like the first example.)   
The time complexity us $O(\log_{10}(n))$ (it is not $O(n)$ because we drop one digit in each iteration.) the space complexity is $O(1)$.