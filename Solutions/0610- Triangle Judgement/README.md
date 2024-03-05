# [610. Triangle Judgement](https://leetcode.com/problems/triangle-judgement)

[中文文档](/solution/0600-0699/0610.Triangle%20Judgement/README.md)

<!-- tags:Database -->

## Description

<p>Table: <code>Triangle</code></p>

<pre>
+-------------+------+
| Column Name | Type |
+-------------+------+
| x           | int  |
| y           | int  |
| z           | int  |
+-------------+------+
In SQL, (x, y, z) is the primary key column for this table.
Each row of this table contains the lengths of three line segments.
</pre>

<p>&nbsp;</p>

<p>Report for every three line segments whether they can form a triangle.</p>

<p>Return the result table in <strong>any order</strong>.</p>

<p>The&nbsp;result format is in the following example.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> 
Triangle table:
+----+----+----+
| x  | y  | z  |
+----+----+----+
| 13 | 15 | 30 |
| 10 | 20 | 15 |
+----+----+----+
<strong>Output:</strong> 
+----+----+----+----------+
| x  | y  | z  | triangle |
+----+----+----+----------+
| 13 | 15 | 30 | No       |
| 10 | 20 | 15 | Yes      |
+----+----+----+----------+
</pre>

## Solutions
1) Provided in Solution1.sql: you can use multiple queries to solve this problem. first you can add a new column named `triangle` to the table. then you `update` the table based on the conditions. then you show all the records. 
2) Provided in Solution2.sql: you can use if-clause to solve this problem. in PostgreSQL you can use `case when` to solve this problem.