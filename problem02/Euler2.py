def iEven(num):
    return num%2==0

def fib(num):
    f = [0,1]
    for i in range(2,num+1):
        f.append(f[i-1] + f[i-2])
    return f[num]

sum = 0
f = 0
n = 0

while f < 4000000:
    n += 1
    f = fib(n)
    if f%2==0:
        sum = sum + f

print sum
