//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends

class meet{
    int start;
    int end;
    int pos;
    public meet(int start,int end,int pos)
    {
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
class Sorting implements Comparator<meet>
{
    @Override
    public int compare(meet o1,meet o2)
    {
        if(o1.end<o2.end)
        {
            return -1;
        }
        else if(o1.end>o2.end)
        {
            return 1;
        }
        return 0;
    }
}
class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // arraylist to store each meeting start ,end and index.
        ArrayList<meet>  a =new ArrayList<meet>();
        for(int i=0;i<N;i++)
        {
            a.add(new meet(S[i],F[i],i));
        }
        // creating a result arraylist
        ArrayList<Integer> a1=new ArrayList<Integer>();
        //greedy solution
        Sorting so=new Sorting();
        Collections.sort(a,so);
        int last_time =a.get(0).end;
        a1.add(a.get(0).pos+1);
        for(int i=1;i<a.size();i++)
        {
            if(a.get(i).start>last_time)
            {
                a1.add(a.get(i).pos+1);
                last_time=a.get(i).end;
            }
        }
        Collections.sort(a1);
        return a1;
    }
}
        
