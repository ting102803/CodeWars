//https://www.codewars.com/kata/52e88b39ffb6ac53a400022e

public class Kata {
	public static String longToIP(long ip) {
    long A = (4278190080L&ip)>>24;
    long B = (16711680L&ip)>>16;
    long C = (65280L&ip)>>8;
    long D = 255L&ip;
		return Long.toString(A)+"."+Long.toString(B)+"."+Long.toString(C)+"."+Long.toString(D); 
	}
}