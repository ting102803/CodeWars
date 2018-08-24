//https://www.codewars.com/kata/5b728f801db5cec7320000c7

public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
    int length = s.length();
    int count =k;
    if(length<=k) return "";
    char az = 'a';
    String saz =null;
    while(count!=0){
      if(s.indexOf(az)!=-1){
        saz = String.valueOf(az);
        s = s.replaceFirst(saz, "");
        count--;
      }
      else az++;
    }
    return s;
    }
}