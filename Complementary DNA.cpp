//https://www.codewars.com/kata/554e4a2f232cdd87d9000038

#include <string>

std::string DNAStrand(const std::string& dna)
{
  int len = dna.size();
  std::string temp ="";
  for(int i=0;i<len;i++){
    
    if(dna.at(i)=='A') temp+="T";
    else if(dna.at(i)=='T') temp+="A";
    else if(dna.at(i)=='C') temp+="G";
    else if(dna.at(i)=='G') temp+="C";
  }
  return temp;
}