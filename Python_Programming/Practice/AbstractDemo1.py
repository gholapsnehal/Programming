from abc import ABC, abstractmethod

#it is compulsory to import abc module and inherti from ABC class so that we can write abstract

class Base(ABC):
    #decorator
    @abstractmethod

    def Add(self,No1,No2):
        pass
    

class Derived(Base):
    pass

dobj = Derived() 

#TypeError: Can't instantiate abstract class Derived without an implementation for abstract method 'Add'
    
