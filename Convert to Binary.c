//https://www.codewars.com/kata/59fca81a5712f9fa4700159a

unsigned long long to_binary(unsigned short n)
{
  long long bi=0;
  long long sum=0;
  long long i=1;
    while(n>0)
    {
        bi=n%2;
        sum+=bi*i;
        n=n/2;
        i*=10;
    }

  return sum;

}
