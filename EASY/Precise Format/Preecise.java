// {Driver code}

class Solution 
{
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) 
    {
        // code here
        ArrayList<Float> resultList = new ArrayList<>();
     
        float exactResult = a / b;
        
        float roundedResult = Math.round(exactResult * 1000f) / 1000f;
        
        resultList.add(exactResult);
        resultList.add(roundedResult);
      
        return resultList;
    }
}
