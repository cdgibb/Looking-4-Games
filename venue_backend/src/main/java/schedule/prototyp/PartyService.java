package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;

public class PartyService {
    @Autowired
    private PartyRepository partyRepository;
    public Object getPartiesByVenue(int venueId) {
        return partyRepository.getPartiesByVenue(venueId);
    }
}
