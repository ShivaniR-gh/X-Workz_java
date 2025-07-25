public class CourtCase {
    int caseId;
    String caseType;
    String judgeName;
    boolean isClosed;
    int year;
	
	public void getCourtCaseInfo(){
		 System.out.println("Case ID: " + caseId);
        System.out.println("Type: " +caseType);
        System.out.println("Judge: " +judgeName);
        System.out.println("Closed: " + isClosed);
        System.out.println("Year: " + year);
        System.out.println("------------------------------------------");
	}
}
