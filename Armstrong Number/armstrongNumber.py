# Using Normal Logic

x = int(input("Enter a Number : "))
dividend = x;
sum = 0

while dividend > 0:
    r = dividend  % 10;
    sum = sum + r**3;
    q = dividend  // 10;
    dividend  = q;

if x==sum:
    print(f"{x} is an Armstrong Number")
else:
    print(f"{x} is Not an Armstrong Number")
