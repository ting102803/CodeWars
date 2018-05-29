//https://www.codewars.com/kata/5a905c2157c562994900009d

public class Solution
{
    public static long[] productArray(int[] numbers)
    {   int n = numbers.length;
        long result[] = new long[n];
        for(int i =0; i<n;i++){
          long sum=1;
          for(int j=0;j<n;j++){
            if(i!=j)
              sum*=numbers[j];
          }
          result[i]=sum;
        }
        return result;
    }
}