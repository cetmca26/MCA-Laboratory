# Create a base class called `Person` with attributes `name` and `code`. Create two child classes:
# - `Account` with an attribute `pay`
# - `Admin` with an attribute `experience`

# Inherit these into a class `Employee` that combines `name`, `code`, `experience`, and `pay`.

class Person:
    def __init__(self, name, code):
        self.name=name
        self.code=code

class Account(Person):
    def __init__(self, name, code, pay):
        Person.__init__(self, name, code)
        self.pay=pay

class Admin(Person):
    def __init__(self, name, code, experience):
        Person.__init__(self, name, code)
        self.experience=experience

class Employee(Account, Admin):
    def __init__(self, name, code, pay, experience):
        Account.__init__(self, name, code, pay)
        Admin.__init__(self, name, code, experience)

    def Display(self):
        display=f"Name: {self.name}\nCode: {self.code}\nPay: {self.pay}\nExperience: {self.experience}\n"
        print(display)
        return display

name=input("Enter name: ")
code=int(input("Enter code: "))
pay=float(input("Enter amount to pay: "))
exp=int(input("Enter experience: "))

emp = Employee(name, code, pay, exp)
emp.Display()