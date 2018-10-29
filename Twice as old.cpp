//https://www.codewars.com/kata/5b853229cfde412a470000d0

int twice_as_old(int dad, int son) {
 int count = 0;
 if((dad+count)<=2*(son+count)) return 2*son-dad;
 while(1){
 if((dad+count)<=2*(son+count)) break;
 count++;
 }
 return count;
}