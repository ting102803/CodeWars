//https://www.codewars.com/kata/517abf86da9663f1d2000003

import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
  String result ="";
  int j = s.length();
  for(int i=0;i<j;i++){
    char a = s.charAt(i);
    if(a=='_'||a=='-'){
      i++;
      a = Character.toUpperCase(s.charAt(i));
    }
      result += String.valueOf(a);
  }
    return result;
}
}