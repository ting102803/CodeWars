//https://www.codewars.com/kata/5541f58a944b85ce6d00006a

public class ProdFib { // must be public for codewars	
	
	public static long[] productFib(long prod) {
      long i=0;
      long j=1;
      while(i*j<prod){
      long temp=i;
      i=j;
      j=temp+j;
      }
      long[] result = new long[3];
      result[0]=i;
      result[1]=j;
      if(prod==i*j) result[2]=1;
      else result[2]=0;
		return result;
   }
}