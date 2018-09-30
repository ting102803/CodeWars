//https://www.codewars.com/kata/515e271a311df0350d00000f

#include <stddef.h>

int square_sum(const int *values, size_t count){
int sum=0;
int i=0;
for(i=0;i<count;i++){
sum+=*(values+i)*(*(values+i));
}
return sum;
}