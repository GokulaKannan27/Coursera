class laptop:
    def __init__(self):
        self.price=""
    def lap(self):
        self.price=int(input("Enter the price:"))
    def display(self):
        print("Cost of Laptop:",self.price)
Hp=laptop()
dell=laptop()
Hp.lap()
Hp.display()
dell.lap()
dell.display()





