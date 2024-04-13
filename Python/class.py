#files in python
from pathlib import Path
#Path('file.txt').touch()
with open('file.txt','w') as f:
    f.write("Hello This is my first file creation in python")
    

















'''#Importing Modules in python
import math
#or
import math as m#(using as keyword create alias name for the math module)
from math import *

import pattern as p
print(p.n)

PI=pi
s=sin(90)
print(s)
print(PI)
root=math.sqrt(9)
r=m.sqrt(9)
print(root,r)
'''
















'''#func()

def key():
    print("Helo ")
key()
#default arguments
def info(name,age=19):
    print("Name:",name)
    print("Age:",age)

info("GK")
info(age=20,name="Viki")

#Required arguments
def func(num,item,price):
    print(f'{num} {item} cost${price}')

func(100,'Stocks',200)

#Keyword arguments
def func1(num,item,price):
    print(f'{num} {item} cost ${price}')

func1(item="Bags",num=150,price=300)

#variable lenght arguments
def func2(*arg):
    for i in arg:
        print(i)
func2(1,2,3,4)

#Docstrings
def odd_even(n):
    #n=int(input("Enter the number:"))
    if n%2==0:
        return "even"
    else:
        return "odd"

print(odd_even(13547))

'''

'''#Data Types
#str
#Integer(int)
#float
#complex
#List([])
l=[1,2,3,"Hi"]
print(l)
l2=[]
for i in range(10):
    l2.append("a")
print(l2)
'''#Nestedlist
'''
l3=[]
for i in range(1,5):
    l4=[]
    for j in range(0,i):
        l4.append(j)
    l3.append(l4)
print(l3)
'''#List operations
'''
#Indexing
print(l3[3])
print(l3[-1])
#slicing
print(l[1:5])
#tuple()
t=()
for i in range(5):
    t=t+(i,)
print(t)
print(type(t))
''' #Nested Tuple
'''
t1=()
for i in range(1,5):
    t2=()
    for j in range(0,i):
        t2=t2+(j,)
    t1=t1+(t2,)
print(t1)
#dictionary{}
dic={'Java':"JamesGoshlings",'C':"Dennis Ritchie",'C++':"Joarne Stroustrup"}
print(type(dic))
print(dic)
print(dic.keys())
print(dic.values())
print(dic.items())
dic1={'A':65,"B":66,"c":(67,99),"d":[68,100]}
print(dic1)
#set()
s=set([1,2,3,4])
print(type(s))
print(s)

#Frozenset
#boolean'''











'''print("-----Course Info-----")
title="DBMS"
code="ITA2009"
fac="Karthikeyan"
print('Title:',title)
print("Code:",code)
print("Faculty:",fac)

input("Enter anything:")
class student:
    name=str()
    def __init__ (self,name):
        self.name=name
class Course:
    code=str()
    def show(self):
        return "f'{name}"
    
    def __init__(self):
        self.code="ITA3009"
        print(self.code)
def show():
    print("Hello python:")

s=student("IOT")

c=Course()

c.show()
show()'''
