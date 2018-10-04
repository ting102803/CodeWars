//https://www.codewars.com/kata/5bb0c58f484fcd170700063d

#include <stdlib.h>
#include <string.h>
long pillars(int nun_of_pillars, int distance, int width) {
  long result=0;
  if (nun_of_pillars>2)result+=(nun_of_pillars-2)*width;
  if (nun_of_pillars>1)result+=(nun_of_pillars-1)*distance*100;
  return result;
}