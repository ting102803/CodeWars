//https://www.codewars.com/kata/5a5032f4fd56cb958e00007a

using namespace std;

int tv_remote(const string &word)
{
    char remote[5][8] = {
                      {'a','b','c','d','e','1','2','3'},
                      {'f','g','h','i','j','4','5','6'},
                      {'k','l','m','n','o','7','8','9'},
                      {'p','q','r','s','t','.','@','0'},
                      {'u','v','w','x','y','z','_','/'}
                      };
    int x=0;
    int y=0;
    int sum=0;
    for (char s : word){
		  for (int i=0; i<5; i++){
        for (int j=0; j<8; j++){
          if(remote[i][j]==s){
            sum += abs(x-i)+abs(y-j) + 1;
				    x = i;
				    y = j;
				    break;  
          }
        }
		  }   	
    }
    return sum;
}