//https://www.codewars.com/kata/568d0dd208ee69389d000016

unsigned rental_car_cost(unsigned d)
{
    if(d>=7) return 40u*d-50u;
    else if(d>=3) return 40u*d-20u;
    else return 40u*d;
}