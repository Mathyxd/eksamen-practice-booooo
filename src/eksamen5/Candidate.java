package eksamen5;

public class Candidate {
    private String name;
    private Party party;
    private int numberOfVotes;

    public Candidate(String name, Party party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }
    public String getName() {
        return name;
    }
    public Party getParty() {
        return party;
    }
    public int getNumberOfVotes() {
        return numberOfVotes;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setParty(Party party) {
        this.party = party;
    }
    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

}
