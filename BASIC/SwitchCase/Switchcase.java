// Driver Code

class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        final double PI = 3.14;
        switch(choice)
        {
            case 1:
                double R = arr.get(0);
                return Math.PI * R * R;
            
            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                return L * B;
                
            default:
                return -1;
        }
    }
}
