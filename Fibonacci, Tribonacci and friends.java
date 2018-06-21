//https://www.codewars.com/kata/556e0fccc392c527f20000c5
public class Xbonacci {

  public double[] xbonacci(double[] signature, int n) {
      int z = signature.length;
      if (z > n) z = n;
      double[] result = new double[n];
      for(int i=0;i<z;i++)
        result[i]=signature[i];
      for(int i=z;i<n;i++){
        double sum=0;
        for(int k=0;k<z;k++)
          sum+=result[i-1-k];
        result[i]=sum;
      }
      return result;
  }
}