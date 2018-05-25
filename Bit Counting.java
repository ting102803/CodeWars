//https://www.codewars.com/kata/526571aae218b8ee490006f4

public class BitCounting {

	public static int countBits(int n){
    int result=0;
		String a = Integer.toBinaryString(n);
    for(int i=0;i<a.length();i++){
      if(a.charAt(i)=='1') result++;
}
return result;

	}
	
}