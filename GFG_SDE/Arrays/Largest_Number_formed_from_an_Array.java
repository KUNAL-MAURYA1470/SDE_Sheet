//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        String ans="";
        for(String s:arr) ans+=s;
        return ans;
    }
}


