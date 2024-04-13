n=int(input("Enter the Block size"))
p=int(input("Enter the process size"))
b=[]
s=[]
c=[]
print("Enter the block elements")
for i in range(0,n):
    b.append(int(input()))
print("Enter the process size")
for i in range(0,p):
    s.append(int(input()))
for i in range(p):
    allocated=False
    for j in range(n):
        if b[j] >= s[i]:
            b[j]=b[j]-s[i]
            allocated=True
            break
    if not allocated:
        print("Process",i+1,"not allocated")
for i in range(0,n):
    print(b[i])
for i in range(0,p):
    print(s[i])
'''n = int(input("Enter the Block size: "))
p = int(input("Enter the number of processes: "))
b = []
s = []

print("Enter the block elements:")
for i in range(n):
    b.append(int(input()))

print("Enter the process sizes:")
for i in range(p):
    s.append(int(input()))

for i in range(p):
    allocated = False
    for j in range(n):
        if b[j] >= s[i]:
            b[j] -= s[i]
            allocated = True
            break
    if not allocated:
        print("Process", i+1, "cannot be allocated.")

print("Blocks after allocation:")
for i in range(n):
    print(b[i])

print("Processes after allocation:")
for i in range(p):
    print(s[i])'''
