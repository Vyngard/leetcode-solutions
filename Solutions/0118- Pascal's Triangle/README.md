# [118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle)

## Description

<p>Given an integer <code>numRows</code>, return the first numRows of <strong>Pascal&#39;s triangle</strong>.</p>

<p>In <strong>Pascal&#39;s triangle</strong>, each number is the sum of the two numbers directly above it as shown:</p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0100-0199/0118.Pascal%27s%20Triangle/images/PascalTriangleAnimated2.gif" style="height:240px; width:260px" />
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> numRows = 5
<strong>Output:</strong> [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> numRows = 1
<strong>Output:</strong> [[1]]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= numRows &lt;= 30</code></li>
</ul>

## Solutions
First you add `[1]` to your final list `answer`. then for each line (`i`), first you add `1`. then you get the last list (last line). consider a `left` and `right` pointer for that last list. then you add `left` and `right` together, add it to the current line and move them forward until you reach the end. then you add `1` to the end of the current line. then you do this for next line.     
The time complexity is `O(numRows^2)` since you have to do this for each line. and the space complexity is `O(numRows^2)` too since you have to create a list for each line.