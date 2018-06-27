//https://www.codewars.com/kata/555624b601231dc7a400017a
import java.util.ArrayList;

public class JosephusSurvivor {
  public static int josephusSurvivor(final int n, final int k) {
    ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++){
		  list.add(i);
		}
    int j=k;
     if(j>list.size())  j=j%list.size();
		while(list.size()!=1){
		  if(j==0)  j=list.size();
		  list.remove(--j);
		  j=j+k;
		  if(j>list.size())  j=j%list.size();
		}
		return list.get(0);
  }  
}