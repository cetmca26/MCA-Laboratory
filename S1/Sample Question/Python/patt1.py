# print the patter 
# 1
# 4       8
# 9       18      36
# 16      32      64      128

n = int(input("Enter the limit : "))
for i in range(n):
    for j in range(i):
        print(i*i*2**j, end = "\t")
    print("")