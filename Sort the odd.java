//https://www.codewars.com/kata/578aa45ee9fd15ff4600090d

import java.util.Arrays;
public class Kata {
  public static int[] sortArray(int[] array) {
    int n=array.length;
    int[] odd = new int[n];
    int[] oddindex = new int[n];
    int how=0;
    for(int i=0;i<n;i++){
      if(array[i]%2==1) {
        odd[i]=array[i];
        oddindex[i]=i;
        how++;
      }
    }
    Arrays.sort(odd);
    Arrays.sort(oddindex);
    for(int i=0;i<how;i++){
      array[oddindex[n-how+i]]=odd[n-how+i];
    }
    return array;
  }
}