//https://www.codewars.com/kata/56f695399400f5d9ef000af5

#include <string.h>

int correct_tail(const char *body, const char *tail) {
  return body[strlen(body)-1]==*tail?1:0;
}