package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    public List<Venue> getAllVenues()   {   return venueRepository.findAll();   }
}
