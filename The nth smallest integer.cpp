//https://www.codewars.com/kata/57a03b8872292dd851000069

static long small(std::vector<long> list, long n){ 
  long k = list.size();
  if(n>k) return -1;
  sort(list.begin(), list.end());
  list.erase(unique(list.begin(), list.end()), list.end());
  k = list.size();
  if(n>k) return -1;
  
  return list.at(n-1);
}