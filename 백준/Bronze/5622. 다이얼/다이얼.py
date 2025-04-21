word = input()
alp = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
time = 0
for ch in word:
    for i in range(len(alp)):
        if ch in alp[i]:
            time = time + i + 3
            
print(time)
    