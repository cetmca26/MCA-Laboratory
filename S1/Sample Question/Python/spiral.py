n = int(input("Enter the limit: "))

array = [[0 for _ in range(n)] for _ in range(n)]   # stores the spiral in 2d array (first all are zero)

num =1   # for printing num from 1, 2, .. to n

top, bottom, left, right = 0, n-1, 0, n-1      # limits for each side

while num<= n*n:       # eg: if limit is 5 the largest number would be 25 in a 2d matrix of size n x n
    # adding the top row to array
    for i in range(left, right + 1):
        array[top][i] = num
        num+=1
    top+=1

    # adding the right column to array
    for i in range(top, bottom + 1):
        array[i][right] = num
        num+=1
    right-=1
     
    # adding the bottom row to array
    for i in range(right, left -1, -1):
        array[bottom][i] = num
        num+=1
    bottom-=1

    # adding the left column to array
    for i in range(bottom, top -1, -1):
        array[i][left] = num
        num+=1
    left+=1

# printing the array contents
for row in array:
    for column in row:
        print(column, end="\t")
    print("\n")