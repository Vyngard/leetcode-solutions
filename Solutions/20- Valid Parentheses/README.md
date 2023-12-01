# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses)

## Description

<p>Given a string <code>s</code> containing just the characters <code>&#39;(&#39;</code>, <code>&#39;)&#39;</code>, <code>&#39;{&#39;</code>, <code>&#39;}&#39;</code>, <code>&#39;[&#39;</code> and <code>&#39;]&#39;</code>, determine if the input string is valid.</p>

<p>An input string is valid if:</p>

<ol>
	<li>Open brackets must be closed by the same type of brackets.</li>
	<li>Open brackets must be closed in the correct order.</li>
	<li>Every close bracket has a corresponding open bracket of the same type.</li>
</ol>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;()&quot;
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;()[]{}&quot;
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;(]&quot;
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s</code> consists of parentheses only <code>&#39;()[]{}&#39;</code>.</li>
</ul>

## Solution
in here we use a stack. if each character is one of the `[({` we add it to the stack. if it is one of the `])}` we check the top of the stack. if it is not the same type of the character we return `false`. (Because when you have `(` as the last character you must close it using `)`, otherwise the input is wrong). Also you should be careful if the stack in the end, is empty or not.if it is not, it means that we opened a bracket and we didn't close it. so the input is wrong.   
Since we iterate over the input string once, the time complexity of this algorithm is `O(n)`. Also we use a stack with a maximum size of `n/2` so the space complexity is `O(n)`.