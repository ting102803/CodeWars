//https://www.codewars.com/kata/57356c55867b9b7a60000bd7

int basic_op(char op, int value1, int value2) {
  if(op=='+')  return value1+value2;
  else if(op=='-')  return value1-value2;
  else if(op=='*')  return value1*value2;
  else if(op=='/')  return value1/value2;
}