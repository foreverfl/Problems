N = int(input())
for _ in range(N):
    password = input()
    if len(password) >= 6 and len(password) <= 9:
        print("yes")
    else:
        print("no")
