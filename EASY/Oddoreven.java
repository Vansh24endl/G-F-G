// { Driver Code Starts
// Initial Template for Java
import java.io.*•
import java. util.*
  
class GFG
{
  public static void main(String args[]) throws IOException 
  {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parselnt(read. readLine());
    while (t-- > 0)
    {
      int N - Integer. parselnt(read. readLine());
      
      Solution 0b = new Solution();
      if (ob.isEven(N))
        System. out. println( "true");
      else
        System. out.println("false");
    }
  }
}
// } Driver Code Ends
// User function Template for Java
class Solution 
{
    static boolean isEven(int n) 
    {
        // code here
        return n % 2 == 0;
    }
}
