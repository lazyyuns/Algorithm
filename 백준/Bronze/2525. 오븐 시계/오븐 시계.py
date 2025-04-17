a,b = map(int,input().split())
c = int(input())
t=b+c
print((a+(t//60))%24, t%60)