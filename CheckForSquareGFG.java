/* Question
Check for Power
Given two positive numbers X and Y, check if Y is a power of X or not.
Example 1:
Input:
X = 2, Y = 8
Output:
1
Explanation:
23 is equal to 8.
 
Example 2:
Input:
X = 1, Y = 8
Output:
0
Explanation:
Any power of 1 is not 
equal to 8.
*/
//User function Template for Java
class Solution{
    static Long isPowerOfAnother(Long x, Long y){
        // code here
        int ans=0;
        if(x==y || y==1){
            ans=1;
        }
        else{
            boolean flag=false;
            for(int i=2;i<Math.sqrt(y)+1;i++){
                if(Math.pow(x,i) ==y){
                    ans=1;
                    flag=true;
                }
                if(Math.pow(x,i)>y || flag==true){
                    break;
                }
            }
        }
        return (long)ans;
    }
}
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            Long X=Long.parseLong(inp[0]);
            Long Y=Long.parseLong(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.isPowerOfAnother(X,Y));
        }
    }
}

// } Driver Code Ends