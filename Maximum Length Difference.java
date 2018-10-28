//https://www.codewars.com/kata/5663f5305102699bad000056

class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        int a1max=0;
        int a1min=99999;
        if(a1.length==0||a2.length==0) return -1;
        for(int i=0;i<a1.length;i++){
          if (a1[i].length()>a1max) a1max=a1[i].length();
          if (a1[i].length()<a1min) a1min=a1[i].length();
        }
        int a2max=0;
        int a2min=99999;
        for(int i=0;i<a2.length;i++){
          if (a2[i].length()>a2max) a2max=a2[i].length();
          if (a2[i].length()<a2min) a2min=a2[i].length();
        }
        return (a1max-a2min>a2max-a1min)?a1max-a2min:a2max-a1min; 
    }
}