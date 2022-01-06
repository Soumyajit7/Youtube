x = int(input("x = "))
count = 0
for i in range(1,x+1):
    rem = x % i
    if rem==0:
        count+=1
if count==2:
    print("prime number")
else:
    print("not prime number")
