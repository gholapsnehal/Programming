// java Client.java

// Package not found
// java -cp . Client.java      ----  we can use this command In case of error package does not exists. 
// -cp == class path

// User defined package import
// je package create kelet tya packages la use krnar ahe hy file

import PPA.Marvellous;        
import PPA.Infosystems;
import PPA.LB.Pune;       // nested package

class Client
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        Infosystems iobj = new Infosystems();
        Pune pobj = new Pune();

        System.out.println("Inside main of Client");

        mobj.fun();
        iobj.gun();
        pobj.sun();
    }
}S