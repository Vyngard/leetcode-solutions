# [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring)

## Description

<p>Given a string <code>s</code>, return <em>the longest</em> <span data-keyword="palindromic-string"><em>palindromic</em></span> <span data-keyword="substring-nonempty"><em>substring</em></span> in <code>s</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;babad&quot;
<strong>Output:</strong> &quot;bab&quot;
<strong>Explanation:</strong> &quot;aba&quot; is also a valid answer.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;cbbd&quot;
<strong>Output:</strong> &quot;bb&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
	<li><code>s</code> consist of only digits and English letters.</li>
</ul>

## Solutions
1- Brute Force (provided in Java code): in here we check all possible substrings and check if they are palindrome or not. This solution is not efficient and it will take O(n^3) time complexity and O(1) space complexity.

2- More efficient solution (provided in Python code): in here, for each character in the string, we expand out to the left and right to check the longest palindrome. This solution will take O(n^2) time complexity and O(1) space complexity.