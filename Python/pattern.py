n=int(input("Enter the n value:"))
i=1
k=1
for i in range(i,n):
    for k in range(1,n+1-i):
        print(" ",end='')
    for j in range(1,i+1):
        print(j,"",end='')
    print()

