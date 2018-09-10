//https://www.codewars.com/kata/55fd2d567d94ac3bc9000064


long long rowSumOddNumbers(unsigned n){
  long long startN=n*(n-1)+1;
  return (startN+startN+(n-1)*2)*n/2;
}