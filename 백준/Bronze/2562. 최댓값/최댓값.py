maxnum = 1
maxi = 0
for i in range(9):
    n = int(input())
    if maxnum < n :
        maxnum = n
        maxi = i+1
print(maxnum, maxi, end="\n")
        