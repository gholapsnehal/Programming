import sys
import os
import hashlib      # checksum check krnyache function


def CalCheckSum(Filename):
    fobj = open(Filename,"rb")     # read in binary format Binary IO

    hobj = hashlib.md5()           # 

    #list = buffer
    Buffer = fobj.read(1024)      

    while(len(Buffer) > 0):
        hobj.update(Buffer)
        Buffer = fobj.read(1024)

    fobj.close()

    return hobj.hexdigest()   # checksum


def main():
    
    Ret = CalCheckSum("DemoX.txt")

    print("checksum of file is : ",Ret)
   
 
if __name__ == "__main__":
    main()


