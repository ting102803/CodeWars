//https://www.codewars.com/kata/580755730b5a77650500010c

public class OddEvenSort {
  public static String sortMyString(String s) {
    int n = s.length();
    String s1="";
    String s2="";
    for(int i=0;i<n;i=i+2){
        s1 += String.valueOf(s.charAt(i));
    }
    s1+=" ";
    for(int i=1;i<n;i=i+2){
      s2 += String.valueOf(s.charAt(i));
    }  
    return s1+s2;
  }
}