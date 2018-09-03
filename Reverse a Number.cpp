//https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5

long long reverseNumber(long long n) {
  int flag =0;
  if(n<0){
    flag = 1;
    n=-n;
  }
  std::string s = std::to_string(n);
  std::string reversed_string = s;
  std::reverse(reversed_string.begin(), reversed_string.end());
  long long myNr = std::stoll(reversed_string);
  if(flag==1) myNr=-myNr;
  return myNr;
}