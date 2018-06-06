//https://www.codewars.com/kata/55a29405bc7d2efaff00007c

import java.math.BigDecimal;

public class Suite {
	
	public static double going(int n) {
     BigDecimal sum = new BigDecimal("0");
     BigDecimal fac = new BigDecimal("1");
    for(int i=1;i<=n;i++){
      fac=fac.multiply(BigDecimal.valueOf(i));
      sum=sum.add(fac);
    }
    BigDecimal result = new BigDecimal("1");
    result=sum.divide(fac,6,BigDecimal.ROUND_FLOOR);
		return result.doubleValue();
	}
}