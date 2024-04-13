'''from pathlib import *
with open('word.txt','a') as f:
    f.write("Hello world!")
    f.write('winner')
with open('word.txt','r') as f1:
    rea=f1.read()
    print(rea)'''

import matplotlib.pyplot as p

x=[1,2,3,4,5]
y=[2,3,7,1,4]

p.plot(x,y,color='red',linestyle='dotted')
p.xlabel("value")
p.ylabel("number")
p.title('Line Plot Example')
p.scatter(x,y)
p.show()


    
