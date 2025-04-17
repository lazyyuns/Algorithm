n = int(input())
nl = list(map(int, input().split()))
min = nl[0]
max = nl[0]
for i in nl:
          if min > i:
              min = i
          if max < i:
              max = i
print(min, max)