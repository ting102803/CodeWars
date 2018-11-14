//https://www.codewars.com/kata/57cf50a7eca2603de0000090

void moveTen(char *str){
for(int i=0;i<strlen(str);i++){
  if(*(str+i)>112) *(str+i)=*(str+i)-26;
  *(str+i)=*(str+i)+10;   
}
}