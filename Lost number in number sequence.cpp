//https://www.codewars.com/kata/595aa94353e43a8746000120

using namespace std;

int findDeletedNumber(list<int> startingList, list<int> mixedList)
{    
     if(startingList.empty()) return 0;
     if(mixedList.empty()) return startingList.front();
     
     int n= startingList.size();
     int sum = (n+1)*n/2;
     int m = mixedList.size();
     
     for(int i=0;i<m;i++){
       sum -= mixedList.front();
       mixedList.pop_front();
     }
     
     return sum;
}