class armstrong:
    def __init__(self,num):
        self.num=num
    def check(self):
        length=len(str(self.num))
        c=str(self.num)
        sum=0
        for ch in c:
            sum=sum+(int(ch)**length)
        if sum==self.num:
            print("its a armstrong")
        else:
            print("Not an armstrong")
k=int(input("Enter the number to check:"))
a=armstrong(k)
a.check()