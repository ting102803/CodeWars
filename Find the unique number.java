//https://www.codewars.com/kata/585d7d5adb20cf33cb000235

 public class Kata {
    public static double findUniq(double arr[]) {
      double first = arr[0];
      double second = arr[1];
      int n = arr.length;
      double uni=0;
      if(first==second){
        for(int i=2;i<n;i++){
          if(arr[i]!=first){
            uni = arr[i];
            break;
            }
        }
      }
      else{
        if(first==arr[2]){
          uni = second;}
        else uni = first;
      }
      
      return uni;
    }
}