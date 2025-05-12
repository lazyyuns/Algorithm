T = int(input())
for t in range(1,T+1):
    n = int(input())
    arr = list(map(int, input().split()))
    score_count = [0] * 101
    for i in arr:
        score_count[i] += 1
    modal_value = 0
    max_count = 0
    for i in range(101):
        if max_count <= score_count[i]:
            max_count = score_count[i]
            modal_value = i
    print(f"#{t} {modal_value}")