// Using Special Logic

import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        int x, q, r, sum=0, dividend;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        x = sc.nextInt();
        String y = String.valueOf(x);
        for(char i : y.toCharArray()){
            int j = Character.getNumericValue(i);
            sum = sum + j*j*j;
        }
        if(x==sum){
            System.out.print(x+" is an Armstrong Number");
        }else{
            System.out.print(x+" is Not an Armstrong Number");
        }
    }
}
