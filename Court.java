public class Court {
    public static void main(String args[]) {
        int courtId = 801;
        String name = "High Court of Karnataka";
        String city = "Bangalore";
        String state = "Karnataka";
        int numberOfJudges = 40;
        int numberOfCasesPerDay = 500;
        boolean isEcourtEnabled = true;
        String chiefJustice = "Prasanna B. Varale";
        int numberOfStaff = 300;
        boolean hasCCTV = true;
        boolean onlineFilingAvailable = true;
        boolean legalAidAvailable = true;
        int numberOfChambers = 25;
        boolean hasLibrary = true;
        boolean airConditioned = true;
        int numberOfCourtrooms = 20;
        String jurisdiction = "State";
        boolean hasSecurityCheck = true;
        boolean rampForDisabled = true;
        String caseType = "Civil and Criminal";

        System.out.println("Court Name: " + name);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Number of Judges: " + numberOfJudges);
        System.out.println("Cases per Day: " + numberOfCasesPerDay);
        System.out.println("eCourt Enabled: " + isEcourtEnabled);
        System.out.println("Chief Justice: " + chiefJustice);
        System.out.println("Staff Count: " + numberOfStaff);
        System.out.println("CCTV Installed: " + hasCCTV);
        System.out.println("Online Filing: " + onlineFilingAvailable);
        System.out.println("Legal Aid: " + legalAidAvailable);
        System.out.println("Chambers: " + numberOfChambers);
        System.out.println("Library Available: " + hasLibrary);
        System.out.println("Air Conditioned: " + airConditioned);
        System.out.println("Courtrooms: " + numberOfCourtrooms);
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Security Check: " + hasSecurityCheck);
        System.out.println("Disabled Access: " + rampForDisabled);
        System.out.println("Case Type: " + caseType);
        System.out.println("Court ID: " + courtId);
    }
}
