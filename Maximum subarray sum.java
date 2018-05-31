//https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c

import java.util.*;
public class Max {
  public static int sequence(int[] arr) {
    if(arr.length==0) return 0;
    int sum = 0;
    int Maxsum[] = new int[arr.length];
    for(int i=0;i<arr.length;i++){
      sum=0;
      for(int j=i;j<arr.length;j++){
        sum += arr[j];
        if(Maxsum[i]<sum)
          Maxsum[i]=sum;
      }
    }
    int max =0;
    for(int i=0;i<Maxsum.length;i++){
      if(max<Maxsum[i])
        max=Maxsum[i];
    }
    return max;
  }
}