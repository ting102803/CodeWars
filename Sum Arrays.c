//https://www.codewars.com/kata/53dc54212259ed3d4f00071c

#include <stddef.h>

int sum_array(const int *values, size_t count){
  int sum=0;
  int inc=0;
  for(inc=0;inc<count;inc++){
    sum+=*(values+inc);
  }
  return sum;
}