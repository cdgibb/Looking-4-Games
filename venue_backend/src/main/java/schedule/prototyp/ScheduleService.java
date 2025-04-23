package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    public Object getPartiesByDay(String day) {
        return scheduleRepository.findAllByDay(day);
    }
}
