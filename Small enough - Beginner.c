//https://www.codewars.com/kata/57cc981a58da9e302a000214

#include <stdbool.h>
#include <stddef.h>

bool small_enough(int *arr, size_t length, int limit)
{
  int count=0;
  for(count=0;count<length;count++){
    if(*(arr+count)>limit) return false;
  }
  return true;
}