import java.util.*;

class PrimeNumber {
    public static void main(String[] args) {
        int x, divisor, rem, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        x = sc.nextInt();
        for (divisor=1; divisor<=x; divisor++){
    	    rem = x % divisor ;
        	if (rem == 0){
    	    	count ++ ;
    	    }
        }
        if (count == 2){
    	    System.out.println("prime number");
        }else{
    	    System.out.println("not prime number");
        }
    }
}
