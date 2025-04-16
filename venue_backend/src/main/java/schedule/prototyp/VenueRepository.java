package schedule.prototyp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface VenueRepository extends JpaRepository<Venue, Integer>{


}
