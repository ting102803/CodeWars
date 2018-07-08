//https://www.codewars.com/kata/5277c8a221e209d3f6000b56

public class BraceChecker {

  public boolean isValid(String braces) {
    char a= ' ';
    char stack[] = new char[braces.length()];
    int n=0;
    int k = braces.length();
    a = braces.charAt(0);
    for(int i=0;i<k;i++){
      a = braces.charAt(0);
      if(a=='['||a=='{'||a=='('){
        stack[n++]=a;
        braces=braces.substring(1);
      }
      else if(n==0) {return false;}
      else if(a==']'&&stack[n-1]=='['){
        n--;
        braces=braces.substring(1);
      }
      else if(a=='}'&&stack[n-1]=='{'){
        n--;
        braces=braces.substring(1);
      }
      else if(a==')'&&stack[n-1]=='('){
        n--;
        braces=braces.substring(1);
      }
      else return false;
    }
    if(n==0) return true;
    else return false;
  }

}