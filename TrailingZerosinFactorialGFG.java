/* Question
Trailing zeroes in factorial
For an integer n, find the number of trailing zeroes in n!.
Examples :
Input: n = 5
Output: 1
Explanation: 5! = 120 so the number of trailing zero is 1.
Input: n = 4
Output: 0
Explanation: 4! = 24 so the number of trailing zero is 0.
Input: n = 43
Output: 9
*/

// User function Template for Java
class Solution {
    static int trailingZeroes(int n) {
        // Write your code here
        int count=0;
        while(n>=5){
            count+=n/5;
            n=n/5;
        }
        return count;
    }
}

//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.trailingZeroes(N);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends