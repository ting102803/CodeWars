//https://www.codewars.com/kata/5a9c35e9ba1bb5c54a0001ac

int Add (int x, int y)
{
  int a=0;
  while (y!=0){
    a = x&y;  
    x = x^y; 
    y = a<<1;
  }
  return x;
}