//https://www.codewars.com/kata/52f787eb172a8b4ae1000a34

public class Solution {
  public static int zeros(int n) {
  int sum=0;
  for(int i=1;i<13;i++){
    sum+=n/Math.pow(5,i);
  }
  return sum;
  }
}