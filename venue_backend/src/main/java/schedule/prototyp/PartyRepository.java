package schedule.prototyp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface PartyRepository  extends JpaRepository<Party, Integer>{
    Object getPartiesByVenue(int venueId);
}
