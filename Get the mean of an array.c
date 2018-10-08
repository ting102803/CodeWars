//https://www.codewars.com/kata/563e320cee5dddcf77000158

#include <stddef.h>

int get_average(const int *marks, size_t count){
int temp=0;
int result=0;
for(temp=0;temp<count;temp++){
  result+=*(marks+temp);
}
return result/count;
}