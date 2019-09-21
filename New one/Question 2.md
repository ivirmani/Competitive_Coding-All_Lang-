You are given a 2d array of integers of size (N * M).
Each of teh cell contains either of these 3 integers : 0,1 and 2
2 : rotten orange
1 : fresh orange
0 : empty cell

---

Each rotten orange can rot frsh oranges in 4 adjacent cells in 1 unit of time. 4 cells are top,bottom,left and right

For a given matrix, find the minimum units of time in which all the oranges become rot. Return -1 if it is not possible

### Input Format:
The 1st line of input contains 2 space separated integers, N and M(denotes size of given 2d array)
The following N lines contains M space separated integers, that denotes the value of cells of given 2d array.

### Constraints:
Value of N and M lies in teh range : [1,10000]
Value of each cell in 2D array can only be 0,1 and 2.

### Output Format
Print the required integer, as described in the problem description

### Sample Input
3 5
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1

### Sample Output
2

### Explanation
In the 1st unit of time, fresh oranges at coordinates:
(0,1), (0,4), (1,0) , (1,2) , (1,4) , (2,4).
In the 2nd unit of time , fresh orange at coordinates:
(2,0) get rot. Hence, in 2 units of time, all the fresh oranges become rot.