package Lession2_Open_Close_Principle.Example3.BetterCode;

public class PDF implements Report{

    @Override
    public String generate() {
       return ("Gerated Pdf report");
    }
}
