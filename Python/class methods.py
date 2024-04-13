class a():
    def __init__(self):
        print("A")
    def display(self):
        print("H...")
class b():
    def __init__(self):
        super().__init__()
        print("B")
    def display(self):
        print("W...")
class c(a,b):
    def __init__(self):
        super().__init__()
        print("C")
    def display(self):
        print("D....")

b=b()
c=c()
