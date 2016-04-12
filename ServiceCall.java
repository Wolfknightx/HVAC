import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Represents a generic service call to a furnace, boiler, AC unit...
 */

public class ServiceCall {

    protected String serviceAddress;
    protected String problemDescription;
    protected Date reportedDate;
    String modifiedReportDate = new SimpleDateFormat("yyyy-MM-dd").format(reportedDate); //added to format the information stores.
    protected Date resolvedDate;
    String modifiedResolvedDate = new SimpleDateFormat("yyyy-MM-dd").format(resolvedDate); //added to format the information stores.
    protected final static double UNRESOLVED = -1  ;  //Flag to indicate this hasn't been resolved so we don't have a fee yet
    protected String resolution;
    protected double fee;
    protected int serviceID;  //This will be used to track the service calls placed according to ID#.

    public ServiceCall(String serviceAddress, String problemDescription, Date date) {
        this.serviceAddress = serviceAddress;
        this.problemDescription = problemDescription;
        this.reportedDate = date;
        this.fee = UNRESOLVED;
    }

    @Override
    public String toString(){
        if (resolution.equals("")){
            return "Address: " + serviceAddress + ", Issue: " + problemDescription + ", Date Reported: "
                    + modifiedReportDate + ".";
        }else {
            return "Address: " + serviceAddress + ", Resolved By: " + resolution + ", Date Resolved: "
                    + modifiedResolvedDate + ", Amount charged: " + fee + ".";
        }
    }



    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


}
