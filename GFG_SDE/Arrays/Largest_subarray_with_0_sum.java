//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        int max_len=0;
        int curr_sum=0;
        mp.put(0,-1);
        for(int i=0;i<n;i++)
        {
            
            curr_sum+=arr[i];
            if(mp.containsKey(curr_sum))
            {
                max_len=Math.max(max_len,Math.abs(i - mp.get(curr_sum)));
            }
            else{
                mp.put(curr_sum,i);
            }
               
            
        }
        return max_len;
    }
}
