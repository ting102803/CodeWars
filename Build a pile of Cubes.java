//https://www.codewars.com/kata/5592e3bd57b64d00f3000047

public class ASum {
	
	public static long findNb(long m) {
		long result=0;
    long count=0;
    while(m>result){
      count++;
      result+=count*count*count;
      //Math.pow(count,3) casting error?;
    }
    if(m==result){
      return count;}
    return -1;
	}	
}