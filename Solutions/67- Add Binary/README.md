# [67. Add Binary](https://leetcode.com/problems/add-binary)

## Description

<p>Given two binary strings <code>a</code> and <code>b</code>, return <em>their sum as a binary string</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> a = "11", b = "1"
<strong>Output:</strong> "100"
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> a = "1010", b = "1011"
<strong>Output:</strong> "10101"
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= a.length, b.length &lt;= 10<sup>4</sup></code></li>
	<li><code>a</code> and <code>b</code> consist&nbsp;only of <code>&#39;0&#39;</code> or <code>&#39;1&#39;</code> characters.</li>
	<li>Each string does not contain leading zeros except for the zero itself.</li>
</ul>

## Solutions
Well I'm not saying the code that I wrote is very subtle and elegant, but it's really a good practice for me to write this code. I think I can do better in the future.     
The solution is simple. consider a pointer for each string, starting from the end. then start adding two values to each other, considering the `carry` too. you just have to consider all the cases when you add to numbers together. The time ans space complexity is `O(max(m, n))`.