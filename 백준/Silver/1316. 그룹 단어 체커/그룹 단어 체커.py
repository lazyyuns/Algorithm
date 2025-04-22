t = int(input())
count = 0

for _ in range(t):
    word = list(input())
    seen = []
    seen.append(word[0])
    for i in range(len(word)-1):
        if word[i] == word[i+1]:
            continue
        else:
            if word[i+1] in seen:
                count += 1
                break
            else:
                seen.append(word[i+1])
print(t-count)            