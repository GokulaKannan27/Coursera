//Access specifiers (__example)->private,(_example)->protected
class company():
    __name=""
    def show(self,n):
        __name=n
        print(__name)
      

s=company()
s.show("Google")
