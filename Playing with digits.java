//https://www.codewars.com/kata/5552101f47fc5178b1000050

public class DigPow {
	
	public static long digPow(int n, int p) {
		// your code
    int a[]=new int[10];
    int i=0;
    int k=n;
    for(i=0;k!=0;i++){
    a[i]=k%10;
    k=k/10;
    }
    double sum=0;
    int j=p;
    i--;
    while(i>=0){
    sum+=Math.pow((double)a[i],(double)(j));
    i--;
    j++;
    }
    if((int)(sum)%n==0) return (long)((int)sum/n);
    return -1;
	}
	
}