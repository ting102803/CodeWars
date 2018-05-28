//https://www.codewars.com/kata/54da5a58ea159efa38000836
public class FindOdd {
	public static int findIt(int[] A) {
    for(int i=0;i<A.length;i++){
      int count =0;
      for(int j=0;j<A.length;j++){
        if(A[i]==A[j]) count++;
      }
      if(count%2==1) return A[i];
    }
    return 0;
  }
}