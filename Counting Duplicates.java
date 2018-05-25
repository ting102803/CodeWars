//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

public class CountingDuplicates {
  public static int duplicateCount(String text) {
        text=text.toLowerCase();
        int n=text.length();
		    int i=0;
		    int sum=0;
		    String buffer= null;
		    char k = '\t';
		    for(i=0;i<n;i++) {
		    k=text.charAt(i);
		    if(i!=text.indexOf(k,i+1)&&text.indexOf(k,i+1)!=-1)
		    	if(buffer==null) {
		    		buffer=String.valueOf(k);
		    		sum++;
		    	}
		    	else if(buffer.indexOf(k)==-1) {
		    		buffer+=k;
		    		sum++;
		    		
		    	}
		  }
		    return sum;
  }
}