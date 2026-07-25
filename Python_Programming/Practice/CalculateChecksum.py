import sys
import os
import hashlib      # checksum check krnyache function


def CalCheckSum(Filename):
    fobj = open(Filename,"rb")     # read in binary format Binary IO

    hobj = hashlib.md5()           # 

    Buffer = fobj.read(1000)      # reading 1000 bytes at one time till file data ends

    while(len(Buffer) > 0):
        hobj.update(Buffer)
        Buffer = fobj.read(1000)

    fobj.close()

    return hobj.hexdigest()   # checksum


def main():
    
    Ret = CalCheckSum("Demo.txt")

    print("checksum of file is : ",Ret)
   
 
if __name__ == "__main__":
    main()


# 1a88f20756104dd343405e22464dac42  : checksum --> 16 byte unique number