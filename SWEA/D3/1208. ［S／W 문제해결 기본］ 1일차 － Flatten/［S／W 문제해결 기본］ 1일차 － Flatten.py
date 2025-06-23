for t in range(1,11):
    N = int(input())
    arr = list(map(int, input().split()))
    for _ in range(N):
        max_ind = arr.index(max(arr))
        min_ind = arr.index(min(arr))
        arr[max_ind] -= 1
        arr[min_ind] += 1
    answer = max(arr) - min(arr)
    print(f"#{t} {answer}")