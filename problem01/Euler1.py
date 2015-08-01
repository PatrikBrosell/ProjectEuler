def isMultipleOfThree(num):
    return num%3==0

def isMultipleOfFive(num):
    return num%5==0

total = 0
for x in range(0, 1000):
    if isMultipleOfThree(x) or isMultipleOfFive(x):
        total = total + x
        print total, x

print total
