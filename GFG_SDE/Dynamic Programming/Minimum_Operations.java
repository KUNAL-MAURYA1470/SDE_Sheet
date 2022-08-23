//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperation(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java


class Solution
{   
    public int minOperation(int n,int[] dp)
    {
        if(n == 0)
            return dp[n]=0;
        
        if(dp[n] != -1)
            return dp[n];
            
        int divide =(n%2==0 ? minOperation(n/2,dp) : (int) 1e9);
        int minus=minOperation(n - 1, dp);
        
        return dp[n]=Math.min(divide,minus)+1;
    }
    
    public int minOperation(int n)
    {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return minOperation(n,dp);
    }
}
