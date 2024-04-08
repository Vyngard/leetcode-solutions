# [1700. Number of Students Unable to Eat Lunch](https://leetcode.com/problems/number-of-students-unable-to-eat-lunch)

<!-- tags:Stack,Queue,Array,Simulation -->

## Description

<p>The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers <code>0</code> and <code>1</code> respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.</p>

<p>The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a <strong>stack</strong>. At each step:</p>

<ul>
	<li>If the student at the front of the queue <strong>prefers</strong> the sandwich on the top of the stack, they will <strong>take it</strong> and leave the queue.</li>
	<li>Otherwise, they will <strong>leave it</strong> and go to the queue&#39;s end.</li>
</ul>

<p>This continues until none of the queue students want to take the top sandwich and are thus unable to eat.</p>

<p>You are given two integer arrays <code>students</code> and <code>sandwiches</code> where <code>sandwiches[i]</code> is the type of the <code>i<sup>​​​​​​th</sup></code> sandwich in the stack (<code>i = 0</code> is the top of the stack) and <code>students[j]</code> is the preference of the <code>j<sup>​​​​​​th</sup></code> student in the initial queue (<code>j = 0</code> is the front of the queue). Return <em>the number of students that are unable to eat.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> students = [1,1,0,0], sandwiches = [0,1,0,1]
<strong>Output:</strong> 0<strong> 
Explanation:</strong>
- Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
- Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
- Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
- Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
- Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
Hence all students are able to eat.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
<strong>Output:</strong> 3
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= students.length, sandwiches.length &lt;= 100</code></li>
	<li><code>students.length == sandwiches.length</code></li>
	<li><code>sandwiches[i]</code> is <code>0</code> or <code>1</code>.</li>
	<li><code>students[i]</code> is <code>0</code> or <code>1</code>.</li>
</ul>

## Solutions
1) Provided in Java code: you can traverse the students array. you must have multiple pointers for that matter. `mark` to show the section of the array that you start looking, which will be updated whenever there is a change in the array (we use that to prevent an inifite loop). you have `top` to show the current student and `index` to show the current sandwich. then you start checking. if the student wants the sandwich you change the value to `-1` and move the `index` to the right and update the `mark` to the current `top`. if the student doesn't want the sandwich you move the `top` to the right. if the `top == mark` it means you have checked all the students and you can break the loop. in the end you return the number of students that didn't get the sandwich. The time complexity is `O(n^2)` and the space complexity is `O(1)`
2) In much easier way you count the number of `1` and `0` based on the students. then you iterate through the sandwich array and check if the sandwich can be given to the student or not. if you reach a point that you can't give sandwich any more, you calculate the number of the sandwiches that still remains (sandwiches behind the point that you reached). The time complexity is `O(n)` and the space complexity is `O(1)`