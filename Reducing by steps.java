//https://www.codewars.com/kata/56efab15740d301ab40002ee

import java.util.function.LongBinaryOperator;
public class Operarray {
    public static long gcdi(long x, long y) {
      if(y==0)
      return Math.abs(x);
      return gcdi(y,x%y);
    }
    public static long lcmu(long a, long b) {
        return (Math.abs(a)*Math.abs(b)) / gcdi(Math.abs(a), Math.abs(b));
    }
    public static long som(long a, long b) {
        return a+b;
    }
    public static long maxi(long a, long b) {
        if(a>b) return a;
        return b;
    }
    public static long mini(long a, long b) {
        if(a>b) return b;
        return a;
    }
    public static long[] operArray(LongBinaryOperator operator, long[] arr, long init) {
         long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = operator.applyAsLong(i == 0 ? init : result[i - 1], arr[i]);
        }
        return result;
    }
}