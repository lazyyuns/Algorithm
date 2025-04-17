n = int(input())
maxn = 0
avg = 0
score = list(map(int,input().split()))

for i in score:
    if maxn < i:
        maxn = i
        
for i in range(n):
    score[i] = score[i]/maxn*100
    
avg = sum(score)/n
print(avg)

    