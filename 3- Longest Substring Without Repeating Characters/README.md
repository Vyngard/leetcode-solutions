# [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters)


## Description

<p>Given a string <code>s</code>, find the length of the <strong>longest</strong> <span data-keyword="substring-nonempty"><strong>substring</strong></span> without repeating characters.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcabcbb&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;abc&quot;, with the length of 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;bbbbb&quot;
<strong>Output:</strong> 1
<strong>Explanation:</strong> The answer is &quot;b&quot;, with the length of 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;pwwkew&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;wke&quot;, with the length of 3.
Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>


## Solution 

we have a set to keep track of the characters that we find. Also, we consider two pointers. left and right. then we iterate through each character in the string and increase the right pointer. if we find a character that is already in the set, we stop moving the right pointer and start moving the left one. by each move of the left pointer, we remove the related character in the set, and then we check if we still have the repetitive character or not. we keep doing that until we remove the repetitive character. then we keep the left pointer, and again start moving the right one. we keep doing that until we reach the end of the string.  
Since we only check the string once, the time complexity is O(n). Also, we use a set to keep track of the characters, so the space complexity is O(n) too.