public class CourtCaseRunner {
    public static void main(String[] args) {

        CourtCase case1 = new CourtCase();
        case1.caseId = 101;
        case1.caseType = "Criminal";
        case1.judgeName = "Justice Rao";
        case1.isClosed = false;
        case1.year = 2020;

        System.out.println("Case ID: " + case1.caseId);
        System.out.println("Type: " + case1.caseType);
        System.out.println("Judge: " + case1.judgeName);
        System.out.println("Closed: " + case1.isClosed);
        System.out.println("Year: " + case1.year);
        System.out.println("------------------------------------------");

        CourtCase case2 = new CourtCase();
        case2.caseId = 102;
        case2.caseType = "Civil";
        case2.judgeName = "Justice Mehta";
        case2.isClosed = true;
        case2.year = 2018;

        System.out.println("Case ID: " + case2.caseId);
        System.out.println("Type: " + case2.caseType);
        System.out.println("Judge: " + case2.judgeName);
        System.out.println("Closed: " + case2.isClosed);
        System.out.println("Year: " + case2.year);
        System.out.println("------------------------------------------");

        CourtCase case3 = new CourtCase();
        case3.caseId = 103;
        case3.caseType = "Family";
        case3.judgeName = "Justice Shah";
        case3.isClosed = false;
        case3.year = 2019;

        System.out.println("Case ID: " + case3.caseId);
        System.out.println("Type: " + case3.caseType);
        System.out.println("Judge: " + case3.judgeName);
        System.out.println("Closed: " + case3.isClosed);
        System.out.println("Year: " + case3.year);
        System.out.println("------------------------------------------");

        // Repeating same structure until case20...

        CourtCase case4 = new CourtCase();
        case4.caseId = 104;
        case4.caseType = "Land";
        case4.judgeName = "Justice Iyer";
        case4.isClosed = true;
        case4.year = 2016;

        System.out.println("Case ID: " + case4.caseId);
        System.out.println("Type: " + case4.caseType);
        System.out.println("Judge: " + case4.judgeName);
        System.out.println("Closed: " + case4.isClosed);
        System.out.println("Year: " + case4.year);
        System.out.println("------------------------------------------");

        }
		}