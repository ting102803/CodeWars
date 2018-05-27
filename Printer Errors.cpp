//https://www.codewars.com/kata/56541980fa08ab47a0000040

class Printer
{
public:
    static std::string printerError(const std::string &s){
    int sum=0;
    for(int i=0;i<s.length();i++){
      if(s.at(i)>109)
        sum++;
    }
    return std::to_string(sum)+"/"+std::to_string(s.length());
    };
};