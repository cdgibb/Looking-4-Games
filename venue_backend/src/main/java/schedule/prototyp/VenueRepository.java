package schedule.prototyp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VenueRepository extends JpaRepository<Venue, Integer>{


    Object getVenuesByName(String search);
}
