import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  static int R = 6;//row number 
  static int C = 6;//column number

    // Complete the hourglassSum function below.
    static int findMaxSum(int [][]mat) 
{ 
    if (R < 4 || C < 4) 
        return -1; 
  
    // Here loop runs (R-2)*(C-2)  
    // times considering different 
    // top left cells of hour glasses. 
    int max_sum = Integer.MIN_VALUE; 
    for (int i = 0; i < R - 2; i++) 
    { 
        for (int j = 0; j < C - 2; j++) 
        { 
            // Considering mat[i][j] as top  
            // left cell of hour glass. 
            int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) + 
				      (mat[i + 1][j + 1]) + (mat[i + 2][j] + 
				      mat[i + 2][j + 1] +  
                       mat[i + 2][j + 2]); 
  
            // If previous sum is less then  
            // current sum then update 
            // new sum in max_sum 
            max_sum = Math.max(max_sum, sum); 
        } 
    } 
    return max_sum; 
} 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*int [][]mat = {{1, 1, 1, 0, 0, 0}, 
                       {0, 1, 0, 0, 0, 0}, 
                       {1, 1, 1, 0, 0, 0}, 
                       {0, 0, 2, 4, 4, 0}, 
                       {0, 0, 0, 2, 0, 0},
                       {0, 0, 1, 2, 4, 0}}; */

		int[][] mat= new int[6][6];
		  for(int i=0;i<6;i++)
		{
			  for(int j=0;j<6;j++)
			{
				  mat[i][j]=scanner.nextInt();
			}
		}
        int res = findMaxSum(mat); 
        if (res == -1) 
            System.out.println("Not possible"); 
        else
            System.out.println("Maximum sum of hour glass = "
                                + res); 
        scanner.close();
    }
}
