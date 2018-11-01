//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad

#include <stddef.h>

void invert(int *values, size_t values_size)
{
for(int count=0;count<values_size;count++){
*(values+count)=*(values+count)*(-1);
}
}
