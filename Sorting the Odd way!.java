//https://www.codewars.com/kata/57fb79784e2d0639c9000066

import java.util.Arrays;
public class Kata {
  public static Double[] sortItOut(Double[] array) {
    int n=array.length;
    Double[] odd = new Double[n];
    Double[] els = new Double[n];
    int how=0;
    for(int i=0;i<n;i++){
      if(Math.floor(array[i])%2==1) {
        odd[i]=array[i];
        how++;
        els[i]=0.0;
      }
      else{
      els[i]=array[i];
       odd[i]=0.0;
      }
    }
    Arrays.sort(odd);
    Arrays.sort(els);
   
  System.arraycopy(odd,n-how,array,0,how);
     int j=0;
    for(int i=n;i>how;i--){
    array[how+j]=els[i-1];
    j++;
    }
    return array;
  }
}