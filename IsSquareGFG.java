
/* question
Is Square
Given four different points in space. Find whether these points can form a square or not.

Example 1:

Input:
x1 = 20, y1 = 10, x2 = 10, y2 = 20, 
x3 = 20, y3 = 20, x4 = 10, y4 = 10 
Output:
Yes
Explanation:
The points (20,10), (10,20), (20,20),
(10,10) forms a square.

*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int x1 = Integer.parseInt(S[0]);
            int y1 = Integer.parseInt(S[1]);
            int x2 = Integer.parseInt(S[2]);
            int y2 = Integer.parseInt(S[3]);
            int x3 = Integer.parseInt(S[4]);
            int y3 = Integer.parseInt(S[5]);
            int x4 = Integer.parseInt(S[6]);
            int y4 = Integer.parseInt(S[7]);

            Solution ob = new Solution();
            System.out.println(ob.isSquare(x1,y1,x2,y2,x3,y3,x4,y4));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // code here
        int[]distances=new int[6];
        int[][] points={{x1,y1},{x2,y2},{x3,y3},{x4,y4}};
        int index=0;
        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                distances[index++]=distanceSquares(points[i],points[j]);
            }
        }
        Arrays.sort(distances);
        
        if(distances[0]>0 &&
           distances[0]==distances[1] &&
           distances[1]==distances[2] &&
           distances[2]==distances[3] &&
           distances[4]==distances[5] &&
           2*distances[0]==distances[4])
           return "Yes";
           
         return "No";
    }
    public static int distanceSquares(int[] p1,int[] p2){
        return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }
};