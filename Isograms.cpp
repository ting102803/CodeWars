//https://www.codewars.com/kata/54ba84be607a92aa900000f1


bool is_isogram(std::string str) {
 
  
  transform(str.begin(), str.end(),str.begin(), ::tolower);
  sort(str.begin(), str.end());
  int pan;
  int len=str.length();
  for( int i=0;i<len-1;i++)
  {
    pan=str[i]^str[i+1];
    if(pan==0)
      return false;
  }
  return true;
}