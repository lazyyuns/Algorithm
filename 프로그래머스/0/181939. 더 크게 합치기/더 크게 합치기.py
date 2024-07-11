def solution(a, b):
    answer = max(int(f"{a}{b}"), int(f"{b}{a}"))
    return answer