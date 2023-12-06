# [242. Valid Anagram](https://leetcode.com/problems/valid-anagram)

## Description

<p>Given two strings <code>s</code> and <code>t</code>, return <code>true</code> <em>if</em> <code>t</code> <em>is an anagram of</em> <code>s</code><em>, and</em> <code>false</code> <em>otherwise</em>.</p>

<p>An <strong>Anagram</strong> is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> s = "anagram", t = "nagaram"
<strong>Output:</strong> true
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> s = "rat", t = "car"
<strong>Output:</strong> false
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length, t.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> and <code>t</code> consist of lowercase English letters.</li>

</ul>


## Solution

we can consider a HashMap (dictionary). for the first string we add its characters and their frequency to the hashmap. then for the second string, we remove each character (or reduce frequency) base on each character. if these two strings are same, then we will have an empty HashMap. if we try to remove a character that is not in the HashMap, it means that these two strings are not anagrams. by considering the HashMap, it doens't matter what kind of character we have in our strings.
Also for the second solution you can sort both strings and compare them too.
since we have to iterate over our strings, the time complexity is `O(n)`. Also by using HashMap, the space complexity is `O(1)`.