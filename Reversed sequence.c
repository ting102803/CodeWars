//https://www.codewars.com/kata/5a00e05cc374cb34d100000d

#include <stdlib.h>

unsigned short *reverse_seq(unsigned short num)
{
    if(num==0) return NULL;
    unsigned short *a = malloc(sizeof(unsigned short)*num);
    for(int i=0;i<num;i++){
    *(a+i)=num-i;
    }
    return a;
}