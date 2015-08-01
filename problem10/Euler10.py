import math

def isPrime(n):
    if n==1:
        return False
    elif n<4:
        return True
    elif n%2==0:
        return False
    elif n<9:
        return True
    elif n%3==0:
        return False
    else:
        r = math.floor(math.sqrt(n))
        f = 5
        while f <= r:
            if n%f == 0:
                return False
            if n%(f+2)==0:
                return False
            f = f + 6
        return True

sum = 5
prime = 5
while prime <= 2000000:
    if isPrime(prime):
        sum = sum + prime
    prime = prime + 2
print sum
