//https://www.codewars.com/kata/5ac6932b2f317b96980000ca

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class Minimum{
	public static int minValue(int[] values){
    Set<Integer> set = new TreeSet<Integer>();
    for(int i=0;i<values.length;i++){
      set.add(values[i]);
    }
    int result =0;
    for(Iterator i= set.iterator();i.hasNext();){
		  result = result*10+(int)i.next();
    }
    return result;
	}

}