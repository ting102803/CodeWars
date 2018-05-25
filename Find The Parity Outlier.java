//https://www.codewars.com/kata/5526fc09a1bbd946250002dc

public class FindOutlier{
  static int find(int[] integers){
    int i=0;
    int a = Math.abs(integers[0])%2;
    int b = Math.abs(integers[1])%2;
    int c = Math.abs(integers[2])%2;
    
    if(a==b)
    {
      for(i=2;i<integers.length;i++)
        {
        if(Math.abs(integers[i])%2!=a) return integers[i];
        }
    }
    else if(a==c){
      return integers[1];
    }
    else {
      return integers[0];
    }
    return 0;
    
}}