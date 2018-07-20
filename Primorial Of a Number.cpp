//https://www.codewars.com/kata/5a99a03e4a6b34bb3c000124

unsigned long long numPrimorial (unsigned short int number )
{
  int prim[10] = {0,};
  int k=1;
  prim[0]=2;
  int n=2;
  while(k!=number){
    n++;
    for(int i=n-1;i>1;i--){
      if(n%i==0) break;
      if(i==2) prim[k++]=n;
    }
  }
  long long result =1;
  for(int i=0;i<number;i++){
    result *= prim[i];
  }
  return  result;
}