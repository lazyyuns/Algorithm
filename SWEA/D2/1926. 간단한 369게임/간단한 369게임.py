N = int(input())
arr = [0]*(N+1) 
for i in range(N+1):
    arr[i] = i
    cnt = 0
    if '3' in str(i) or '6' in str(i) or '9' in str(i):
        cnt += str(i).count('3')
        cnt += str(i).count('6')
        cnt += str(i).count('9')
        arr[i] = '-' * cnt
for i in range(1, N+1):
    print(arr[i], end=" ")
    