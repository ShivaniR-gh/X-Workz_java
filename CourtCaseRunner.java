public class CourtCaseRunner {
    public static void main(String[] args) {

        CourtCase case1 = new CourtCase();
        case1.caseId = 101;
        case1.caseType = "Criminal";
        case1.judgeName = "Justice Rao";
        case1.isClosed = false;
        case1.year = 2020;
        case1.getCourtCaseInfo();
       

        CourtCase case2 = new CourtCase();
        case2.caseId = 102;
        case2.caseType = "Civil";
        case2.judgeName = "Justice Mehta";
        case2.isClosed = true;
        case2.year = 2018;

        case2.getCourtCaseInfo();

        CourtCase case3 = new CourtCase();
        case3.caseId = 103;
        case3.caseType = "Family";
        case3.judgeName = "Justice Shah";
        case3.isClosed = false;
        case3.year = 2019;

        case3.getCourtCaseInfo();
        

        CourtCase case4 = new CourtCase();
        case4.caseId = 104;
        case4.caseType = "Land";
        case4.judgeName = "Justice Iyer";
        case4.isClosed = true;
        case4.year = 2016;

       case4.getCourtCaseInfo();

        }
		}