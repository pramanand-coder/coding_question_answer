/*Question  GFG
3 Divisors

You are given a list of q queries and for every query, you are given an integer N.  The task is to find how many numbers(less than or equal to N) have number of divisors exactly equal to 3.
Example 1:

Input:
q = 1
query[0] = 6
Output:
1
Explanation:
There is only one number 4 which has
exactly three divisors 1, 2 and 4 and
less than equal to 6.
*/
//User function Template for Java
class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(long num:query){
            boolean[] prime=new boolean[(int)num+1];
            Arrays.fill(prime,true);
            prime[0]=prime[1]=false;
            for(int p=2;p*p<=num;p++){
                if(prime[p]==true){
                    for(int i=2;i*p<=num;i++){
                        prime[p*i]=false;
                    }
                }
            }
            int cnt=0;
            for(int i=2;i*i<=num;i++){
                if(prime[i]==true){
                    cnt+=1;
                }
            }
            ans.add(cnt);
        }
        return ans;
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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        
System.out.println("~");
}
    }
}