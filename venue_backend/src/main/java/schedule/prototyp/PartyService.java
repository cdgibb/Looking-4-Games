package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
    @Autowired
    private PartyRepository partyRepository;
    public Object getPartiesByVenue(int venueId) {
        return partyRepository.getPartiesByVenueId(venueId);
    }
}
