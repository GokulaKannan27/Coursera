class laptop:
    def __init__(self):
        self.price=0
        self.Ram=""
    def display(self):
        self.price=500000
        self.Ram=128
        print(self.price)
        print(self.Ram)
h=laptop()
h.display()


