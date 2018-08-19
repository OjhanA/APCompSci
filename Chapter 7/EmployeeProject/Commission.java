package EmployeeProject;
/**
 * Represents an commissioner
 * @author Ojhan Ardalan 
 * @version 2/28/17
 */
public class Commission extends Hourly {
    private double totalSales = 0;
    private double comRate;

    public Commission (String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double comRate) {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        this.comRate = comRate;
    }

    public void addSales (double tSales){
        totalSales += tSales;
    }
    
    public double pay()
    {
        double payment = super.pay() + (totalSales * comRate);
        totalSales = 0;
        return payment;
    }

}
