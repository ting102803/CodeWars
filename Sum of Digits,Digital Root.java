//https://www.codewars.com/kata/541c8630095125aba6000c00

public class DRoot {
  public static int digital_root(int n) {
   int m=n;
   int temp[]=new int[20];
   temp[1]=n;
   int i=0;
   while(sum(temp)>9){
     m=sum(temp);
     for(int j=0;j<temp.length;j++){
       temp[j]=0;
     }
     while(m>0){
       temp[i]=m%10;
       i++;
       m/=10;
  }}
  return sum(temp);
}
  public static int sum(int[] nn){
  int how = nn.length;
  int sum=0;
  for(int i=0;i<how;i++)
  {
    sum+=nn[i];
  }
  return sum;
  }
}