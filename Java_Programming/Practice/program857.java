import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    @Override
    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Description;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }
}

class StudyTracker
{
    public ArrayList <StudyLog> Database;

    public StudyTracker()
    {
        Database = new ArrayList<StudyLog>();
    }

    public void InsertLog()
    {

    }

    public void DisplayLog()
    {

    }

    public void exportToCSV()
    {

    }

    public void SummaryByDate()
    {

    }

    public void SummaryBySubject()
    {

    }


}


public class program857
{
    public static void main(String A[]) 
    {
        StudyTracker stobj = new StudyTracker();

        Scanner sobj = new Scanner(System.in);

        int iChoice = 0;

        System.out.println("--------------------------------------------------------");

        System.out.println("                Welcome to Study Tracker                ");

        System.out.println("--------------------------------------------------------");

        do
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("           Please select appropriate option  :          ");
            System.out.println("--------------------------------------------------------");

            System.out.println("1  :  Insert new study log");
            System.out.println("2  :  View all study logs");
            System.out.println("3  :  export study log to csv");
            System.out.println("4  :  Summary of study log by date");
            System.out.println("5  :  Summary of study log by subject");
            System.out.println("6  :  Exit the application");

            System.out.println("--------------------------------------------------------");
            
            iChoice = sobj.nextInt();

            switch(iChoice)
            {
                // Insert new log
                case 1 :
                    stobj.InsertLog();
                    break;

                // View all study logs
                case 2 :
                    stobj.DisplayLog();
                    break;
                
                // export to csv
                case 3 :
                    stobj.exportToCSV();
                    break;

                // Summary by date
                case 4 :
                    stobj.SummaryByDate();
                    break;
                
                // summary by subjects
                case 5 :
                    stobj.SummaryBySubject();
                    break;

                // exit = terminate project
                case 6 :
                    break;

                // default break
                default :

                    System.out.println("Please enter valid option");
                    break;
            }


        }while(iChoice != 6);


        System.out.println("--------------------------------------------------------");

        System.out.println("             Thank you for using StudyTracker           ");

        System.out.println("--------------------------------------------------------");


    }  // end of main
}      // end of class


