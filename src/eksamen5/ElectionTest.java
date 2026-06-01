package eksamen5;


import java.util.ArrayList;

public class ElectionTest {
    public void main(){
        Election election = new Election();
        election.addCandidate(new Candidate("pia k", Party.BLÅ, 100));
        election.addCandidate(new Candidate("pia a", Party.GRØN, 10));
        election.addCandidate(new Candidate("pia b", Party.RØD, 140));
        election.addCandidate(new Candidate("pia c", Party.GRØN, 1100));
        election.addCandidate(new Candidate("pia d", Party.BLÅ, 1020));

        System.out.println("total votes; " + election.getTotalVotes());

        ArrayList<Candidate> grønne = election.getCandidatesFromParty(Party.GRØN);
        for (Candidate c : grønne) {
            System.out.println(c.getName());
        }
    }


}
