//https://www.codewars.com/kata/56606694ec01347ce800001b

namespace Triangle
{
  bool isTriangle(int a, int b, int c)
  { 
   return a>c-b&&a>b-c&&b>a-c ? true : false ;
  }
};