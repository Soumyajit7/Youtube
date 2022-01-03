#include <stdio.h>

int main() {
    int x, q, r, dividend, sum=0;
    printf("Enter a Number : ");
    scanf("%d",&x);
    dividend = x;
    while(dividend >0){
        r = dividend  % 10;
        sum = sum + (r*r*r);
        q = dividend  / 10;
        dividend  = q;
    }
    if(x==sum){
        printf("%d is an Armstrong Number", x);
    }else{
        printf("%d is Not an Armstrong Number", x);
    }
    return 0;
}
