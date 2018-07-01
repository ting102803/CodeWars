//https://www.codewars.com/kata/583203e6eb35d7980400002a

import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      int l = arr.size();
      int j=0;
      for(int i=0;i<l;i++){
        int k= arr.get(i).length();
        if((arr.get(i).charAt(0)==':'||arr.get(i).charAt(0)==';')&&
        (arr.get(i).charAt(k-1)==')'||arr.get(i).charAt(k-1)=='D')
        ){
          if(k==2) j++;
          else if(k==3){
            if(arr.get(i).charAt(k-2)=='~'||arr.get(i).charAt(k-2)=='-'){
              j++;
            }
          }
          }
      }
      return j;
  }
}