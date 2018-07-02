//https://www.codewars.com/kata/52fba66badcd10859f00097e

public class Troll {
    public static String disemvowel(String str) {
     str = str.replaceAll("a", "");
     str = str.replaceAll("e", "");
     str = str.replaceAll("i", "");
     str = str.replaceAll("o", "");
     str = str.replaceAll("u", "");
     str = str.replaceAll("A", "");
     str = str.replaceAll("E", "");
     str = str.replaceAll("I", "");
     str = str.replaceAll("O", "");
     str = str.replaceAll("U", "");
     return str;
    }
}