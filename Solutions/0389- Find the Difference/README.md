# [389. Find the Difference](https://leetcode.com/problems/find-the-difference)


<!-- tags:Bit Manipulation,Hash Table,String,Sorting -->

## Description

<p>You are given two strings <code>s</code> and <code>t</code>.</p>

<p>String <code>t</code> is generated by random shuffling string <code>s</code> and then add one more letter at a random position.</p>

<p>Return the letter that was added to <code>t</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcd&quot;, t = &quot;abcde&quot;
<strong>Output:</strong> &quot;e&quot;
<strong>Explanation:</strong> &#39;e&#39; is the letter that was added.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;&quot;, t = &quot;y&quot;
<strong>Output:</strong> &quot;y&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 1000</code></li>
	<li><code>t.length == s.length + 1</code></li>
	<li><code>s</code> and <code>t</code> consist of lowercase English letters.</li>
</ul>

## Solutions
since you are only working with lowercase letters, you can use an array of size 26 to store the count of each letter in the string `s`. Then, you can iterate through the string `t` and decrement the count of each letter in the array. The letter that has a count of -1 is the letter that was added to `t`. you can also use `hashmap` to store the count of each letter in the string `s` and then iterate through the string `t` and decrement the count of each letter in the `hashmap`. the letter that doesn't exist in the `hashmap` is our answer.