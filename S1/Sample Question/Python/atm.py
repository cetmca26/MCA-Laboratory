# 8. ATM System Using Python OOP
# Develop an ATM system with the following features:

#  - Account creation
#  - Check account details
#  - Check balance
#  - Deposit amount
#  - Withdraw amount

class Acount:
    MIN_SAVINGS = 1000
    def __init__(self, name, acc_no, acc_type, pin, balance):
        self.name=name
        self.acc_no=acc_no
        self.acc_type=acc_type
        self.pin=pin
        self.balance=balance
        self.transaction=None
    
    def Displaydetails(self):
        print("Account holder name: ",self.name)
        print("Account Number: ",self.acc_no)
        print("Account type: ",self.acc_type)

    def Displaybalance(self):
        print(f"Balance: {self.balance}/-")

    def deposite(self):
        amount=float(input("Enter the amount to deposite: "))
        if amount<0:
            print("amount must be positve.")
        elif amount>25000:
            print("deposit limit is 25000/-.")
        else:
            enter_pin=input("Enter your 4 digit pin:")
            if enter_pin==self.pin:
                self.balance += amount
                self.transaction = f"Deposited {amount}/-"
                print(f"{amount} deposited to your acconut successfully!")
            else:
                print("Invalid pin! Transaction failed.")
    
    def withdraw(self):
        amount=float(input("Enter the amount to withdraw: "))
        if amount<0:
            print("amount must be positive.")
        elif amount>25000:
            print("withdraw limit is 25000/-.")
        elif self.acc_type=='savings' and self.balance-amount<self.MIN_SAVINGS :
            print("Savings account must contain a minimum balance of ",self.MIN_SAVINGS)
        elif amount>self.balance:
            print("Insufficeint balance!")
        else:
            enter_pin=input("Enter your 4 digit pin: ")
            if enter_pin==self.pin:
                self.balance -= amount
                self.transaction = f"Withdrawn {amount}/-"
                print(f"{amount} withdrawn from your account successfully!") 
            else:
                print("Invalid pin! Transaction failed.")

    def receipt(self):
        print("------Transaction receipt------")
        print("Acconut name: ",self.name)
        print("Account number: ",self.acc_no)
        print("Account type: ",self.acc_type)
        print("Last transaction: ",self.transaction)
        print("Remaining balance: ",self.balance,"/-")
        print("Thank you for using our banking service!")
    
print("--------Account creation--------")
name=input("Enter your name: ")
accno=input("Enter your 8-digit account number: ")
while len(accno) != 8 or not accno.isdigit():
    print("Invalid account number! Please enter an 8-digit account number.")
    accno = input("Enter your account number: ")

acctype=input("Enter your account type(savings/current): ").lower()

while acctype not in ('savings','current'):
    print("Invalid account type! plaese enter 'savings' or 'current'")
    acctype=input("Enter your account type(savings/current): ").lower()
print("Account created successfully!!")

pin = input("Enter 4-digit PIN number: ")
while len(pin)!=4 or not pin.isdigit():
    print("Pin number must contain 4-digit.")
    pin = input("Enter a 4-digit PIN number: ")
print("Pin generated successfully!!")

balance=0
account=Acount(name, accno, acctype, pin, balance)
while(True):
    print("------Options------")
    print("1.Check account details\n2.Check balance\n3.Deposite\n4.Withdraw\n5.Exit")
    op=int(input("Enter a option: "))
    if op==1:
        account.Displaydetails()
    elif op==2:
        account.Displaybalance()
    elif op==3:
        account.deposite()
    elif op==4:
        account.withdraw()
    elif op==5:
        account.receipt()
        break
    else:
        print("Invalid option!")
