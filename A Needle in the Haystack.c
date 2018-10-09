//https://www.codewars.com/kata/56676e8fabd2d1ff3000000c

#include <stddef.h>
#include <stdlib.h>
#include <string.h>

char *find_needle(const char **haystack, size_t count){
  int i=0;
  char* result;
  for(i=0; i<count;++i)
  {
    if(strcmp(haystack[i], "needle")==0)
    {
      asprintf(&result, "found the needle at position %d", i);
      return result;
    }
  }
}