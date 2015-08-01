n = 0
done = False

while not done:
    n += 1
    counter = 0
    for i in range(1,20+1):
        if n%i == 0:
            counter += 1
    if counter == 20:
        done = True

print n
