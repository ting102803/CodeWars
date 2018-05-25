//https://www.codewars.com/kata/57ed30dde7728215300005fa

public class BumpsTheRoad {
  public static String bumps(final String road) {
    char b  ;
    int bump=0;
    for(int i=0;i<road.length();i++){
    b = road.charAt(i);
    if(b=='n')
    bump++;
    }
    if (bump>15) return "Car Dead";
    else return "Woohoo!"; // your code here
  }
}