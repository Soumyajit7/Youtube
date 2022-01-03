// Using Normal Logic

import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        int x, q, r, sum=0, dividend;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        x = sc.nextInt();
        dividend = x;
        while(dividend >0){
            r = dividend  % 10;
            sum = sum + r*r*r;
            q = dividend  / 10;
            dividend  = q;
        } 
        if(x==sum){
            System.out.print(x+" is an Armstrong Number");
        }else{
            System.out.print(x+" is Not an Armstrong Number");
        }
    }
}
