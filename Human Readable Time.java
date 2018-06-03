//https://www.codewars.com/kata/52685f7382004e774f0001f7

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int min = seconds/60;
    int hour = min/60;
    min = min%60;
    seconds = seconds%60;
    String HH=Integer.toString(hour);
    String MM=Integer.toString(min);
    String SS=Integer.toString(seconds);
    if(HH.length()==1) HH="0"+HH; 
    if(MM.length()==1) MM="0"+MM;
    if(SS.length()==1) SS="0"+SS;
    return HH+":"+MM+":"+SS;
  }
}