//https://www.codewars.com/kata/54598d1fcbae2ae05200112c

#include <stdbool.h>
#include <stddef.h>

typedef bool (*Predicate)(int);

bool all(int* arr, size_t size, Predicate fun) {
  while(size>0){
  if(!fun(arr+size)) return false;
  size--;
  }
  return true;
}
