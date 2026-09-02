///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 60 : Question 2
//  Program Name : NumberOperations
//  Description  : Perform different number-related operations requested
//                 by the client
//
//  Supported Operations:
//
//      EVEN <number>
//      ODD <number>
//      PRIME <number>
//      PERFECT <number>
//      FACTORIAL <number>
//      REVERSE <number>
//      QUIT
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

class NumberOperations
{
    public String CheckEven(int iNo)
    {
        if(iNo % 2 == 0)
        {
            return iNo + " is an Even Number";
        }

        return iNo + " is not an Even Number";
    }

    public String CheckOdd(int iNo)
    {
        if(iNo % 2 != 0)
        {
            return iNo + " is an Odd Number";
        }

        return iNo + " is not an Odd Number";
    }

    public String CheckPrime(int iNo)
    {
        int iCnt = 0;

        if(iNo <= 1)
        {
            return iNo + " is not a Prime Number";
        }

        for(iCnt = 2; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                return iNo + " is not a Prime Number";
            }
        }

        return iNo + " is a Prime Number";
    }

    public String CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo <= 0)
        {
            return iNo + " is not a Perfect Number";
        }

        for(iCnt = 1; iCnt <= iNo / 2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            return iNo + " is a Perfect Number";
        }

        return iNo + " is not a Perfect Number";
    }

    public String CalculateFactorial(int iNo)
    {
        long lFactorial = 1;
        int iCnt = 0;

        if(iNo < 0)
        {
            return "Factorial is not defined for negative numbers";
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            lFactorial = lFactorial * iCnt;
        }

        return "Factorial is : " + lFactorial;
    }

    public String ReverseNumber(int iNo)
    {
        int iDigit = 0;
        int iReverse = 0;
        int iTemp = iNo;

        if(iNo < 0)
        {
            iTemp = -iNo;
        }

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;
            iReverse = (iReverse * 10) + iDigit;
            iTemp = iTemp / 10;
        }

        if(iNo < 0)
        {
            iReverse = -iReverse;
        }

        return "Reverse number is : " + iReverse;
    }

    public String PerformOperation(String strCommand)
    {
        String strParts[] = strCommand.trim().split("\\s+");

        if(strCommand.trim().equalsIgnoreCase("QUIT"))
        {
            return "QUIT";
        }

        if(strParts.length != 2)
        {
            return "Invalid command format";
        }

        String strOperation = strParts[0].toUpperCase();

        try
        {
            int iNo = Integer.parseInt(strParts[1]);

            switch(strOperation)
            {
                case "EVEN":
                    return CheckEven(iNo);

                case "ODD":
                    return CheckOdd(iNo);

                case "PRIME":
                    return CheckPrime(iNo);

                case "PERFECT":
                    return CheckPerfect(iNo);

                case "FACTORIAL":
                    return CalculateFactorial(iNo);

                case "REVERSE":
                    return ReverseNumber(iNo);

                default:
                    return "Invalid command";
            }
        }
        catch(NumberFormatException e)
        {
            return "Invalid number";
        }
    }
}