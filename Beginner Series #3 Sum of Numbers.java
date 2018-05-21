//https://www.codewars.com/kata/55f2b110f61eb01779000053

public class Sum
  {  
     public int GetSum(int a, int b)
     {
      int n = Math.abs(b-a);
      int sum=0;
      if(b>a){
      for(int i=0;i<=n;i++){
         sum+=a+i;   
      }
      return sum;
      }
      else if(b<a){
      for(int i=0;i<=n;i++){
         sum+=b+i;   
      }
      return sum;
      }
      else return a;
      }
     }