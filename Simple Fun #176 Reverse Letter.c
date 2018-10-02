//https://www.codewars.com/kata/58b8c94b7df3f116eb00005b

#include <stdlib.h>
#include <string.h>
char *reverse_letter(const char *str)
{  
  int i=0;
  int j=0;
  int len=strlen(str);
  char *result=calloc(sizeof(char)*len,sizeof(char));

  for( i = len; i >= 0; i--){
        	if (64 < str[i] && str[i] < 91){
        		result[j++]=str[i];
        	}else if(96 < str[i] && str[i] < 123){
        		result[j++]=str[i];
        	}
        }
  return result;
}