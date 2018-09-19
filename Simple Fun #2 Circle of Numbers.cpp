//https://www.codewars.com/kata/58841cb52a077503c4000015


int circleOfNumbers(int n, int firstNumber)
{
  int half = n/2;
  if(half>firstNumber){
    return firstNumber+half;
  }
  else return firstNumber-half;
}