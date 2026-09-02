///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 60 : Question 1
//  Program Name  : MathOperations
//  Description   : Perform mathematical operations requested by the client
//                  and return the calculated result
//
//  Supported Operations:
//
//      ADD <No1> <No2>
//      SUB <No1> <No2>
//      MULT <No1> <No2>
//      DIV <No1> <No2>
//      MOD <No1> <No2>
//      MAX <No1> <No2>
//      MIN <No1> <No2>
//      QUIT
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

class MathOperations
{
    public String PerformOperation(String strCommand)
    {
        String strParts[] = strCommand.trim().split("\\s+");

        if(strParts.length == 0)
        {
            return "Invalid command";
        }

        String strOperation = strParts[0].toUpperCase();

        if(strOperation.equals("QUIT"))
        {
            return "QUIT";
        }

        if(strParts.length != 3)
        {
            return "Invalid command";
        }

        try
        {
            long iNo1 = Long.parseLong(strParts[1]);
            long iNo2 = Long.parseLong(strParts[2]);

            switch(strOperation)
            {
                case "ADD":
                    return "Result is : " + (iNo1 + iNo2);

                case "SUB":
                    return "Result is : " + (iNo1 - iNo2);

                case "MULT":
                    return "Result is : " + (iNo1 * iNo2);

                case "DIV":

                    if(iNo2 == 0)
                    {
                        return "Division by zero is not allowed";
                    }

                    return "Result is : " + (iNo1 / iNo2);

                case "MOD":

                    if(iNo2 == 0)
                    {
                        return "Division by zero is not allowed";
                    }

                    return "Result is : " + (iNo1 % iNo2);

                case "MAX":

                    if(iNo1 > iNo2)
                    {
                        return "Maximum number is : " + iNo1;
                    }
                    else
                    {
                        return "Maximum number is : " + iNo2;
                    }

                case "MIN":

                    if(iNo1 < iNo2)
                    {
                        return "Minimum number is : " + iNo1;
                    }
                    else
                    {
                        return "Minimum number is : " + iNo2;
                    }

                default:
                    return "Invalid command";
            }
        }
        catch(NumberFormatException e)
        {
            return "Invalid numbers";
        }
    }
}