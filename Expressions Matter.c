//https://www.codewars.com/kata/5ae62fcf252e66d44d00008e

int expression_matter(int a, int b, int c) {
  int max = a * b * c;
  if (max < a * (b + c)) {
    max = a * (b + c);
  } 
  if (max < a + b * c) {
    max = a + b * c;
  } 
  if (max < (a + b) * c) {
    max = (a + b) * c;    
  } 
  if (max < a + b + c) {
    max = a + b + c;
  }

  return max;
}