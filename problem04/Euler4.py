def isPalindrome(num):
    return str(num) == str(num)[::-1]

largest = 0
a = 100

while a <= 999:
    b = 100
    while b <= 999:
        if isPalindrome(a*b) and a*b > largest:
            largest = a*b
        b += 1
    a += 1
print largest
