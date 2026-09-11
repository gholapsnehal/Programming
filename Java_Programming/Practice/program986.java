
// BUILDER:  design pattern code

class ParkingTicket
{
    private int ticketNumber;
    private String vehicleNumber;
    private int floorNumber;
    private int spotNumber;
    private String entryTime;

    /*public ParkingTicket(int a, String b, int c, int d, String e)
    {
        this.ticketNumber = a;
        this.vehicleNumber = b;
        this.floorNumber = c;
        this.spotNumber = d;
        this.entryTime = e;
    }*/
                    //(classname object)
    private ParkingTicket(Builder builder)
    {
        this.ticketNumber = builder.ticketNumber;
        this.vehicleNumber = builder.vehicleNumber;
        this.floorNumber = builder.floorNumber;
        this.spotNumber = builder.spotNumber;
        this.entryTime = builder.entryTime;

    }


    public void display()
    {
        System.out.println("Ticket Number  : "+this.ticketNumber);
        System.out.println("Vehicle Number : "+this.vehicleNumber);
        System.out.println("Floor Number   : "+this.floorNumber);
        System.out.println("Spot Number    : "+this.spotNumber);
        System.out.println("Entry Time     : "+this.entryTime);
    }
        
    
}

// DP
public static class Builder
{
    private int ticketNumber;
    private String vehicleNumber;
    private int floorNumber;
    private int spotNumber;
    private String entryTime;

        // Builder = returntype
    public Builder setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
        return  this;
    }

    public Builder setVehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
        return  this;
    }

    public Builder setFloorNumber(int floorNumber)
    {
        this.floorNumber = floorNumber;
        return  this;
    }

    public Builder setSpotNumber(int spotNumber)
    {
        this.spotNumber = spotNumber;
        return  this;
    }

    public Builder setEntryTime(String entryTime)
    {
        this.entryTime = entryTime;
        return  this;
    }

          //returntype ParkingTicket
    public ParkingTicket build()
    {
        return new ParkingTicket(this);

    }

} 

public class program986
{
    public static void main(String A[])
    {
        

    }
    
}
