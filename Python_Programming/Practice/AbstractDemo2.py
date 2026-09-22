from abc import ABC, abstractmethod

#it is compulsory to import abc module and inherit from ABC class so that we can write abstract

class Base(ABC):
    #decorator
    @abstractmethod

    def Add(self,No1,No2):
        pass
    

class Derived(Base):
    
    #concrete method
    def Add(self,No1,No2):
        return No1 + No2

dobj = Derived() 

Ret = dobj.Add(10,11)

print("Addition is : ",Ret)


    
