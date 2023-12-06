# [49. Group Anagrams](https://leetcode.com/problems/group-anagrams)

## Description

<p>Given an array of strings <code>strs</code>, group <strong>the anagrams</strong> together. You can return the answer in <strong>any order</strong>.</p>

<p>An <strong>Anagram</strong> is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> strs = ["eat","tea","tan","ate","nat","bat"]
<strong>Output:</strong> [["bat"],["nat","tan"],["ate","eat","tea"]]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> strs = [""]
<strong>Output:</strong> [[""]]
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> strs = ["a"]
<strong>Output:</strong> [["a"]]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= strs.length &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= strs[i].length &lt;= 100</code></li>
	<li><code>strs[i]</code> consists of lowercase English letters.</li>
</ul>


## Solution
there are two solutions for this problem:    
1) for each elemenet in the array, we sort the string. then we add the data to the dictionary like this `{sorted_string: [original_string]}`. we do this for all the elements in the array. in the end we return a list of values in the dictionary. This solution is in time of `O(n*m*log(m))`. since we have to iterate over all of our elements `n` and sorting each element takes `m*log(m)` time. also for the space complexity the hashmap takes `O(n)` space. For `Array.sort` and anagram list we need `O(n*m)` space. so the overall space will be `O(n*m)`. (I provided the code in Java)   
2) the second solution is to assign each character to a prime number. then for each element in the list, we calculate the multiplication of the prime numbers related to the characters and save it like this `{multiplication: [original_string]}`. in the end we return a list of values in the dictionary. This solution is in time of `O(n*m)`. since we have to iterate over all of our elements `n` and for each element we have to iterate over all of the characters `m`. BUT the space will be efficient since we don't have to sort the strings. although it is still `O(n*m)` but it is better than the first solution. (I provided the code in Python)