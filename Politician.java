public class Politician {
    int politicianId;
    String name;
    String party;
    String constituency;
    boolean isMinister;

    public Politician(int politicianId, String name, String party, String constituency, boolean isMinister) {
        this.politicianId = politicianId;
        this.name = name;
        this.party = party;
        this.constituency = constituency;
        this.isMinister = isMinister;
    }

    public void getPoliticianInfo() {
        System.out.println("Politician ID: " + politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Constituency: " + constituency);
        System.out.println("Minister: " + isMinister);
        System.out.println("-----------------------------------");
    }
}
