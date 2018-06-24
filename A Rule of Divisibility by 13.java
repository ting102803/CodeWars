//https://www.codewars.com/kata/564057bc348c7200bd0000ff
class Thirteen {
    
    public static long thirt(long n) {
     long[] rema = {1, 10, 9, 12, 3, 4};
     String result = Long.toString(n);
     long sum=0;
     for(int i=0;i<result.length();i++){
         sum+=Character.getNumericValue(result.charAt(result.length()-1-i))*rema[i%6];
     }
     
     while(true){
       result = Long.toString(sum);
       long temp=0;
       for(int i=0;i<result.length();i++){
         temp+=Character.getNumericValue(result.charAt(result.length()-1-i))*rema[i%6];
       }
       if(sum==temp) break;
       sum=temp;
     }
     return sum;
  }
}