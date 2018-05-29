//https://www.codewars.com/kata/54b80308488cb6cd31000161

public class Groups{

  public static boolean groupCheck(String s){
    int a=0,b=0,c=0;
    char stack[] = new char[20];
    int n=1;
    for(int i=0;i<s.length();i++){
      if (s.charAt(i)=='{') {stack[n++]=s.charAt(i); a++;}
      else if (s.charAt(i)=='[') {stack[n++]=s.charAt(i); b++;}
      else if (s.charAt(i)=='(') {stack[n++]=s.charAt(i); c++;}
      else if (s.charAt(i)=='}') {
        if(stack[n-1]=='{'){
          stack[--n]=' ';
          a--;}
        else return false;
      }
      else if (s.charAt(i)==']') {
        if(stack[n-1]=='['){
          stack[--n]=' ';
          b--;}
        else return false;
      }
      else if (s.charAt(i)==')') {
        if(stack[n-1]=='('){
          stack[--n]=' ';
          c--;}
        else return false;
      }
      if(a<0||b<0||c<0) return false;
    }
    
    if(a==0 && b==0 && c==0) return true;
    else return false;
  }
  
}