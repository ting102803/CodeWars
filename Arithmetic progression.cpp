//https://www.codewars.com/kata/55caf1fd8063ddfa8e000018

std::string arithmeticSequenceElements(int a, int r, int n)
{
  std::string result = std::to_string(a);
  for(int i =1;i<n;i++){
    result +=", "+std::to_string(a+r*i);
  }
  return result;
}