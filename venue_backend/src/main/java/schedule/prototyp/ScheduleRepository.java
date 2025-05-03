package schedule.prototyp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import java.lang.ScopedValue;
import java.util.List;
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{


    List<Schedule> findAllByDay(String day);
}
//public interface ScheduleRepository {
//}
