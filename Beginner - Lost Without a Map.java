//https://www.codewars.com/kata/57f781872e3d8ca2a000007e

public class Maps {
  public static int[] map(int[] arr) {
    int count=0;
    int a[] = new int[arr.length];
    for(count=0;count<arr.length;count++){
      a[count]=2*arr[count];
    }
    return a;
  }
}