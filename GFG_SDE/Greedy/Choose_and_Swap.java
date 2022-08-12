//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        Solution obj = new Solution();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String A = read.readLine().trim();
            
            String ans = obj.chooseandswap(A);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    
    String chooseandswap(String A){
        PriorityQueue <Character> ans=new PriorityQueue <Character>();
        for(int i=0;i<A.length();i++)
        {
            if(!ans.contains(A.charAt(i)))
                ans.add(A.charAt(i));
        }
        for(int i=0;i<A.length();i++){
            char a=A.charAt(i);
            ans.remove(a);
            if(!ans.isEmpty() && Character.compare(a,ans.peek())>0 ){
                A=A.replace(a,'*');
                A= A.replace(ans.peek(), a);
                A= A.replace('*', ans.peek());
                break;
            }
        }
        return A;
    }
    
}
