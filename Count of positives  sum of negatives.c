//https://www.codewars.com/kata/576bb71bbbcf0951d5000044

#include <stddef.h>

void count_positives_sum_negatives(
  int *values, size_t count, int *positivesCount, int *negativesSum){
  int temp=0;
  for(temp=0;temp<count;temp++){
    if(*(values+temp)>0) *positivesCount+=1;
    else if(*(values+temp)<0) *negativesSum+=*(values+temp);
  }
  }