class employee():
    def __init__(self,name,salary):
        self.name=name
        self.salary=salary

class Manager(employee):
    def __init__(self,name,salary,dept):
        super().__init__(name,salary)
        self.dept=dept
    def display(self):
        print("Name: ",self.name)
        print("Salary: ",self.salary)
        print("Department: ",self.dept)
c=Manager("Harish","$45000","Score")
c.display()
    
    
    
