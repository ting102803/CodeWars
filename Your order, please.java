//https://www.codewars.com/kata/55c45be3b2079eccff00010f

public class Order {
  public static String order(String words) {
    if (words.equals("")) return "";
	String[] splite = words.split(" ");
    int how=splite.length;
    String[] temp = new String[how];
    for(int i=0;i<how;i++){
      for(int j=0;j<how;j++){
		if(splite[j].indexOf(String.valueOf(i+1))!=-1)
			temp[i]=splite[j];
		}
	}
    String result = "";
    for(int i=0;i<how;i++){
		if(i==0) result+=temp[i];
		else result+=" "+temp[i];
	}
    return result;
  }
}