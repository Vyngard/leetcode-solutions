# [424. Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement)

## Description

<p>You are given a string <code>s</code> and an integer <code>k</code>. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most <code>k</code> times.</p>

<p>Return <em>the length of the longest substring containing the same letter you can get after performing the above operations</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;ABAB&quot;, k = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> Replace the two &#39;A&#39;s with two &#39;B&#39;s or vice versa.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;AABABBA&quot;, k = 1
<strong>Output:</strong> 4
<strong>Explanation:</strong> Replace the one &#39;A&#39; in the middle with &#39;B&#39; and form &quot;AABBBBA&quot;.
The substring &quot;BBBB&quot; has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of only uppercase English letters.</li>
	<li><code>0 &lt;= k &lt;= s.length</code></li>
</ul>

## Solutions
imagine that we have this `[A,B,A,B,A,B]` and `k=2`. we know that in order to reach the most repeating character we need to change the ones that occurred less, as we go through the string. so for that we keep a hashmap (dictionary) to keep track of the number of occurrence for each character. in eech step we check if the number of replacement is less than `k` or not. for example in the third step we have `[A,B,A]`. so we know that we have to replace `B` (less occurrence character). how many replacement should we do: maximum number of the occurrences of a character which is `A = 2` subtract from our sliding windows size which is `3` --> `3 - 2 = 1`. or for example in the fourth step `B=2` and `A=2`. so `max of occurrence = 2` and `windows size = 4`. so `4-2=2` replacemenet which is valid because is `<= k`.    
So for the last step this condition is not true (`max of occurrence = 3`, and `windows size = 6` so `6-3=3` and `3 > k`). in this condition, we have to move our left pointer to the right (and of course reduce the number of occurrence of the related character too), and then continue our sliding window.