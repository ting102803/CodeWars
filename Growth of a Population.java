//https://www.codewars.com/kata/563b662a59afc2b5120000c6
class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int n=0;
        p0=p0+(int)(p0*percent)/100+aug;
        n++;
        while(p>p0) 
        {p0=p0+(int)(p0*percent)/100+aug;
        n++;}
        return n;
    }
}