# hourglass
you have to print the largest sum among all the hourglasses in the array
It is evident from definition of hour glass that number of rows and number of columns must be equal to 3.
If we count total number of hour glasses in a matrix, we can say that the count is equal to count of possible top left cells in hour glass. Number of top-left cells in a hour glass is equal to (R-2)*(C-2). 
Therefore, in a matrix total number of hour glass is (R-2)*(C-2)

mat[][] = 2 3 0 0 0 

          0 1 0 0 0
          
          1 1 1 0 0 
          
          0 0 2 4 4
          
          0 0 0 2 0
          
Possible hour glass are :
2 3 0   3 0 0    0 0 0  
  1      0       0 
1 1 1  1 1 0   1 0 0 


0 1 0  1 0 0  0 0 0 
  1      1      0  
0 0 2  0 2 4  2 4 4 


1 1 1  1 1 0  1 0 0
  0      2      4
0 0 0  0 0 2  0 2 0

We consider all top left cells of hour glasses one by one. For every cell, we compute sum of hour glass formed by it. 
Finally we return maximum sum.
