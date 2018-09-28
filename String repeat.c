//https://www.codewars.com/kata/57a0e5c372292dd76d000d7e

#include <string.h>

char *repeat_str(size_t count, const char *src) {
  int i=0;
  char *temp=calloc(count * strlen(src) + 1, sizeof(char));
 while (count > 0) {
        strcat(temp, src);
        count--;
    }
  return temp;
}