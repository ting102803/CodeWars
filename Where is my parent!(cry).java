//https://www.codewars.com/kata/58539230879867a8cd00011c

import java.util.Arrays;

class WhereIsMyParent {
    static String findChildren(final String text) {
        int n = text.length();
        String Tempbuffer[] = new String[n];
        String TempBigbuffer[] = new String[n];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
          if (Character.isUpperCase(text.charAt(i))) {
             TempBigbuffer[j++]=String.valueOf(text.charAt(i));
            }
          else{
            Tempbuffer[k++] = String.valueOf(text.charAt(i));
          }}
          
        String Bigbuffer[] = new String[j];
        String buffer[] = new String[k];
          
        System.arraycopy(TempBigbuffer,0,Bigbuffer,0,j);
        System.arraycopy(Tempbuffer,0,buffer,0,k);

        Arrays.sort(Bigbuffer);
        Arrays.sort(buffer);
          
        String complete[] = new String[n];
        System.arraycopy(Bigbuffer,0,complete,0,j);
        System.arraycopy(buffer,0,complete,j,k);

        Arrays.sort(complete, String.CASE_INSENSITIVE_ORDER);
        String result="";
        for(int i=0;i<n;i++){
          result += complete[i];
        }
        return result;
    }
}