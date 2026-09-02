///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 61 : Question 2
//  Program Name : ServerOperations
//  Description  : Provide information about the server based on the
//                 command received from the client
//
//  Supported Commands:
//
//      DATE
//      TIME
//      SERVERNAME
//      HELP
//      QUIT
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.time.*;

class ServerOperations
{
    public String GetDate()
    {
        LocalDate dobj = LocalDate.now();

        return dobj.toString();
    }

    public String GetTime()
    {
        LocalTime tobj = LocalTime.now();

        return tobj.toString();
    }

    public String GetServerName()
    {
        try
        {
            InetAddress iobj = InetAddress.getLocalHost();

            return "Server Name : " + iobj.getHostName();
        }
        catch(UnknownHostException e)
        {
            return "Server name not available";
        }
    }

    public String GetHelp()
    {
        return "Available Commands:\n" +
               "DATE\n" +
               "TIME\n" +
               "SERVERNAME\n" +
               "HELP\n" +
               "QUIT";
    }

    public String PerformOperation(String strCommand)
    {
        strCommand = strCommand.trim().toUpperCase();

        switch(strCommand)
        {
            case "DATE":
                return GetDate();

            case "TIME":
                return GetTime();

            case "SERVERNAME":
                return GetServerName();

            case "HELP":
                return GetHelp();

            case "QUIT":
                return "QUIT";

            default:
                return "Invalid command";
        }
    }
}