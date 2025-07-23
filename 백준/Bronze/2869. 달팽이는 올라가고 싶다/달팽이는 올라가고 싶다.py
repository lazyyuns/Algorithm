a,b,v = map(int, input().split())
d = (v-b)/(a-b)
print(int(d) if int(d)==d else (v - b)//(a - b)+1)