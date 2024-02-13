# [168. Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title)

## Description

<p>Given an integer <code>columnNumber</code>, return <em>its corresponding column title as it appears in an Excel sheet</em>.</p>

<p>For example:</p>

<pre>
A -&gt; 1
B -&gt; 2
C -&gt; 3
...
Z -&gt; 26
AA -&gt; 27
AB -&gt; 28 
...
</pre>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> columnNumber = 1
<strong>Output:</strong> &quot;A&quot;
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> columnNumber = 28
<strong>Output:</strong> &quot;AB&quot;
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> columnNumber = 701
<strong>Output:</strong> &quot;ZY&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= columnNumber &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

## Solutions
Refer to the problem [0171- Excel Sheet Column Number](../0171-%20Excel%20Sheet%20Column%20Number/README.md). You can see the algorithm that you can change the character into the number. now you have to do the opposite. The catch here is that you should subtract 1 from the number before you start the conversion. This is because the number 1 is represented by the character 'A' and not 'A' + 1. So, you have to subtract 1 from the number before you start the conversion. The rest of the algorithm is the same as the previous problem.