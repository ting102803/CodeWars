//https://www.codewars.com/kata/55908aad6620c066bc00002a

#include <stdbool.h>

bool xo (const char* str)
{
  int count = 0;
  int countx =0;
  int counto =0;
  for(count=0;count<strlen(str);count++){
  if(*(str+count)=='x'||*(str+count)=='X') countx++;
  else if(*(str+count)=='o'||*(str+count)=='O') counto++;
  }
  return countx==counto;
}