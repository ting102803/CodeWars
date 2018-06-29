//https://www.codewars.com/kata/597770e98b4b340e5b000071

public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
      int i = dirtyFileName.indexOf("_");
      int j = dirtyFileName.indexOf(".");
      for(j=j+1;j<dirtyFileName.length();j++){
        if(dirtyFileName.charAt(j)=='.'){
          break;
        }
      }
       return dirtyFileName.substring(i+1,j);
    }
}