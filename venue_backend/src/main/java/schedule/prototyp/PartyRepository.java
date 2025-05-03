package schedule.prototyp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PartyRepository  extends JpaRepository<Party, Integer>{
    Object getPartiesByVenueId(int venueId);
}
