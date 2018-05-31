//https://www.codewars.com/kata/57eb8fcdf670e99d9b000272

public class Kata {

  public static String high(String s) {
    String word[]= s.split(" ");
    int maxsum=0;
    int maxsumindex=0;
    for(int i =0;i<word.length;i++){
      int sum=0;
      for(int j=0;j<word[i].length();j++){
        sum+=(int)word[i].charAt(j)-96;
      }
      if(maxsum<sum){
        maxsum=sum;
        maxsumindex=i;
      }
    }  
    return word[maxsumindex];
  }

}