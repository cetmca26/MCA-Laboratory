class Time:
    def __init__(self, hours=0, mins=0, secs=0):
        self.hours=hours
        self.mins=mins
        self.secs=secs
        
    def get_time(self):
        self.hours=int(input("Enter hour :"))
        self.mins=int(input("Enter minitues :"))
        self.secs=int(input("Enter seconds :"))
        
    def __add__(self,time2):
        hour=self.hours+time2.hours
        min=self.mins+time2.mins
        sec=self.secs+time2.secs
        if(sec>=60):
            min=min+1
            sec=sec%60
        if(min>=60):
            hour=hour+1
            min=min%60
        if(hour>=24):
            hour=hour%24
            
        time3=Time(hour,min,sec)
        return time3
    def display(self):
        print(str(self.hours)+":"+str(self.mins)+":"+str(self.secs))

t1=Time()
t2=Time()

t1.get_time()
t2.get_time()

t3=t1+t2

t3.display()
        
        
        
        
        
        
        
        
# h1,m1,sec1=int(input("Enter the hours,minutes and seconds of time 1:"))
