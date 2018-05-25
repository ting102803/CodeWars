//https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763

using namespace std;

class SequenceSum{
  int count;
  public:
  SequenceSum (int);
  string showSequence();
  
};

string SequenceSum::showSequence(){
    std::string result;
 if(count==0) return "0=0";
  else if(count<0) return std::to_string(count)+"<0";
   else{ for(int i=0;i<=count;i++){
      result += std::to_string(i);
      if(i!=count)
      result += '+';
      else {
      result += " = ";
      }
    }
      int sum=0;
      for(int i=0;i<=count;i++){
      sum += i;
      }
      result += std::to_string(sum);
      return result;
}}

SequenceSum::SequenceSum (int c) {
  count = c;
}