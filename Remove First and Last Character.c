//https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0

char* remove_char(char* dst, const char* src)
{  
  int temp=0;
  for(temp=0;temp<strlen(src)-2;temp++){
  dst[temp]=src[temp+1];
  }
  dst[temp]='\0';
  return dst;
}
