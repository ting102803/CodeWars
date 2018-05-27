//https://www.codewars.com/kata/542c0f198e077084c0000c2e

int divisors(long long n)
{ 
  long long m = n/2;
  int count=0; 
  while(m>=1)
  {
    if(n%m==0)
    {
      count++;
    }
      m--;
    }
	return count+1;
}