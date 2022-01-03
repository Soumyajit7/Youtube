# Using Special Logic

x=int(input("Enter a Number : "))
sum=0

for i in str(x):
    sum = sum + int(i)**3
    
if x==sum:
    print(f"{x} is an Armstrong Number")
else:
    print(f"{x} is Not an Armstrong Number")
