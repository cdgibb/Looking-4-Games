package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    public Object getPartiesByDay(String day) {
        return scheduleRepository.findAllByDay(day);
    }
}
