# [205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings)

## Description

<p>Given two strings <code>s</code> and <code>t</code>, <em>determine if they are isomorphic</em>.</p>

<p>Two strings <code>s</code> and <code>t</code> are isomorphic if the characters in <code>s</code> can be replaced to get <code>t</code>.</p>

<p>All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> s = "egg", t = "add"
<strong>Output:</strong> true
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> s = "foo", t = "bar"
<strong>Output:</strong> false
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> s = "paper", t = "title"
<strong>Output:</strong> true
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>t.length == s.length</code></li>
	<li><code>s</code> and <code>t</code> consist of any valid ascii character.</li>
</ul>

## Solutions
1) Provided in Python Code: you can use one dictionary. for each character in `s` you store the relavant character in `t` in the dictionary. but before you add the character, you should check if the character in `t` is already in values or not. because for example you can add `b:s` to dictionary and then if you want to add `a:s` you must return `False` because `s` is already mapped to another character. If the character exists in the dictionary, you simply check that the value is equals to the character in `t` or not. If not, return `False`. in this method, since you have to search the values in the dictionary, which takes `O(n)` time, and you do this inside a for loop, the worse case scenario for time complexity is `O(n^2)`. So we can use extra space to fix this problem      
2) provided in Java Code: This method is similar to method 1, but we use two hashmaps instead of one. in one we map `s[i]:t[i]` and in the other one we map `t[i]:s[i]`. in this case when we add a new character, we can simply check in both hashmaps if they contain the same value or not. in this method, since we don't have to interate over the values (instead we used a second hashmap which is operates in `O(1)` time), the time complexity is `O(n)`. but we use double space instead of the first method.