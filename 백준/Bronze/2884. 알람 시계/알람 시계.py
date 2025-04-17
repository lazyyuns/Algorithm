#if문

h,m = map(int, input().split())

if(m < 45):
    print((h+23)%24, (m+15)%60)
else:
    print(h, (m+15)%60)