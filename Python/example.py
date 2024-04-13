class student:
    def __init__(self):
        self.name=""
        self.rno=""
    def get(self):
        self.name=str(input("Enter name:"))
        self.rno=int(input("Enter register number:"))
    def show(self):
        print(self.name)
        print(self.rno)
   
s=student()
for i in range(1,3):
    s.get()
    s.show()
