//https://www.codewars.com/kata/526c7363236867513f0005ca

#include <stdbool.h>

bool IsLeapYear(int year) {
  if(year%400==0) return true;
  else if(year%100!=0&&year%4==0) return true;
  else return false;
}