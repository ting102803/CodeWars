//https://www.codewars.com/kata/57a2013acf1fa5bfc4000921

double find_average(double* array, int length) {
  double sum=0;
  for(int i=0;i<length;i++){
  sum+=*(array+i);
  }
  return sum/length;
}