#include <stdio.h>

int main() {
    int x, divisor, rem, count=0;
    printf("x = ");
    scanf("%d",&x);
    for (divisor=1; divisor<=x; divisor++){
	    rem = x % divisor ;
    	if (rem == 0){
	    	count ++ ;
	    }
    }
    if (count <= 2)
    {
	    printf("\nprime number");
    }else{
	    printf("\nnot prime number");
    }
    return 0;
}
