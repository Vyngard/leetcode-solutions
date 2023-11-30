# [14. Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix)

## Description

<p>Write a function to find the longest common prefix string amongst an array of strings.</p>

<p>If there is no common prefix, return an empty string <code>&quot;&quot;</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> strs = [&quot;flower&quot;,&quot;flow&quot;,&quot;flight&quot;]
<strong>Output:</strong> &quot;fl&quot;
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> strs = [&quot;dog&quot;,&quot;racecar&quot;,&quot;car&quot;]
<strong>Output:</strong> &quot;&quot;
<strong>Explanation:</strong> There is no common prefix among the input strings.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= strs.length &lt;= 200</code></li>
	<li><code>0 &lt;= strs[i].length &lt;= 200</code></li>
	<li><code>strs[i]</code> consists of only lowercase English letters.</li>
</ul>


## Solution
You pick the first element in the array as the example. then for each character, you check if other elements have the same characters. you stop searching until you find the first different character (or you encounter a word that has smaller size the the first element). then you just retrun the substring of the first element upto the index of the first different character.   
Since we have to check the characters of the first element (we consider it as m) and then we have to check the whole Array (we consider it as n), the time complexity is `O(m*n)`.