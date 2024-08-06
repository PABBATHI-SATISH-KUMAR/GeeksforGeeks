<h2><a href="https://www.geeksforgeeks.org/problems/minimum-sum-of-two-elements-from-two-arrays0253/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card">Minimum sum of two elements from two arrays</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two arrays <strong>a[] </strong>and <strong>b[]</strong> of same size.Your task is to find minimum sum of two elements such that they belong to different arrays and are not at same index in their arrays.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input : </strong>
a[] = {5, 4, 13, 2, 1}
b[] = {2, 3, 4, 6, 5}
<strong>Output : </strong>
3
<strong>Explanation :</strong>
We take 1 from a[] and 2 from b[]
Sum is 1 + 2 = 3.</span></pre>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre><span style="font-size:18px"><strong>Input : </strong>
a[] = {5, 4, 13, 1}
b[] = {3, 2, 6, 1}
<strong>Output : </strong>
3
<strong>Explanation :</strong>
We take 1 from a[] and 2 from b[].
Note that we can't take 1 from b[]
as the elements can not be at same
index. </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>minSum()</strong>&nbsp;which takes the array <strong>A[]</strong>, <strong>B[] </strong>and its size <strong>N</strong><strong> </strong>as inputs and <strong>returns</strong> the minimum sum.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)<br>
<br>
<br>
<strong>Constraints:</strong><br>
1&lt;=N&lt;=10<sup>5</sup><br>
1&lt;=a[i]&lt;=10<sup>5</sup><br>
1&lt;=b[i]&lt;=10<sup>5</sup></span><br>
<br>
<br>
<br>
&nbsp;</p>

<p>&nbsp;</p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;