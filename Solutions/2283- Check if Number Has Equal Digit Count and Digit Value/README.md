# [2283. Check if Number Has Equal Digit Count and Digit Value](https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value)

## Description

<p>You are given a <strong>0-indexed</strong> string <code>num</code> of length <code>n</code> consisting of digits.</p>

<p>Return <code>true</code> <em>if for <strong>every</strong> index </em><code>i</code><em> in the range </em><code>0 &lt;= i &lt; n</code><em>, the digit </em><code>i</code><em> occurs </em><code>num[i]</code><em> times in </em><code>num</code><em>, otherwise return </em><code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num = &quot;1210&quot;
<strong>Output:</strong> true
<strong>Explanation:</strong>
num[0] = &#39;1&#39;. The digit 0 occurs once in num.
num[1] = &#39;2&#39;. The digit 1 occurs twice in num.
num[2] = &#39;1&#39;. The digit 2 occurs once in num.
num[3] = &#39;0&#39;. The digit 3 occurs zero times in num.
The condition holds true for every index in &quot;1210&quot;, so return true.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> num = &quot;030&quot;
<strong>Output:</strong> false
<strong>Explanation:</strong>
num[0] = &#39;0&#39;. The digit 0 should occur zero times, but actually occurs twice in num.
num[1] = &#39;3&#39;. The digit 1 should occur three times, but actually occurs zero times in num.
num[2] = &#39;0&#39;. The digit 2 occurs zero times in num.
The indices 0 and 1 both violate the condition, so return false.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == num.length</code></li>
	<li><code>1 &lt;= n &lt;= 10</code></li>
	<li><code>num</code> consists of digits.</li>
</ul>

## Solutions
you just consider an array of 10 elements to store the frequency of each digit in the given number, then you iterate over the number and check if the frequency of the digit in the array is equal to the digit itself, if not return false, otherwise return true.