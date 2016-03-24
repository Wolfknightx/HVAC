import java.util.Date;

/**
 * Created by Wolfknightx on 3/23/2016.
 * This will be for service calls for water heaters.
 */

public class WaterHeater extends ServiceCall{

    private int heaterAge = 0;
    static double serviceFee;
    static double cityCharge = 20;

    public WaterHeater(String serviceAddress, Date date, String serviceDescription, int ageOfHeater){
        super(serviceAddress, serviceDescription, date);
        this.fee = serviceFee + cityCharge;
        this.heaterAge = ageOfHeater;
    }

    @Override //this will override the base code and apply a new format.
    public String toString(){
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);

        return "Water Heater Service Call " + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Water Heater Age = " + heaterAge + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + (feeString) ;
    }
}
