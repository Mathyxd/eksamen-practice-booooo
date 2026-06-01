package eksamen5;

import java.util.ArrayList;

public class Election {
    ArrayList<Candidate> candidates = new ArrayList<>();

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public int getTotalVotes() {
        int total = 0;
        for (Candidate c : candidates) {
            total = total + c.getNumberOfVotes();
        }
        return total;
    }

    public ArrayList<Candidate> getCandidatesFromParty(Party party) {
      ArrayList<Candidate> result = new ArrayList<>();
      for (Candidate c : candidates) {
          if (c.getParty() == party) {
              result.add(c);
          }
        }
      return result;
    }
}
