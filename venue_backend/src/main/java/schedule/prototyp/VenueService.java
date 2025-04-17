package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    public List<Venue> getAllVenues()   {   return venueRepository.findAll();   }

    public Venue getVenueById(int venueId){ return venueRepository.findById(venueId).orElse(null)}

    public void createVenue(Venue newVenue) {venueRepository.save(newVenue);}

    public void updateVenue(int venueId, Venue venue){
        Venue existing = getVenueById(venueId);
        existing.setName(venue.getName());
        existing.setAddress(venue.getAddress());
        existing.setEmail(venue.getEmail());
        existing.setOpenTime(venue.getOpenTime());
        existing.setCloseTime(venue.getCloseTime());
    }
}
