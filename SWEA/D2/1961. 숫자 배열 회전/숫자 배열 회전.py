T = int(input())
for t in range(1, T+1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    arr_1 = []
    arr_2 = []
    arr_3 = []
    for j in range(N):
        for i in range(N-1,-1,-1):
            arr_1.append(arr[i][j])
    for i in range(N-1, -1, -1):
        for j in range(N-1, -1, -1):
            arr_2.append(arr[i][j])
    for j in range(N-1,-1,-1):
        for i in range(N):
            arr_3.append(arr[i][j])
    print(f"#{t}")
    
    for i in range(0,N*N, N):
        arr_90 = ''.join(map(str,arr_1[i:i+N]))
        arr_180 = ''.join(map(str,arr_2[i:i+N]))
        arr_270 = ''.join(map(str,arr_3[i:i+N]))
        print(f"{arr_90} {arr_180} {arr_270}")
        
    
    
            
        