package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("venues/{venueId}/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;
/*
    @GetMapping("/monday")
    public Object getMonday(Model model) {return new ResponseEntity<>(scheduleService.getMonday(), HttpStatus.OK); }

    @GetMapping("/tuesday")
    public Object getTuesday() {return new ResponseEntity<>(scheduleService.getTuesday(), HttpStatus.OK); }

    @GetMapping("/wednesday")
    public Object getWednesday() {return new ResponseEntity<>(scheduleService.getWednesday(), HttpStatus.OK); }

    @GetMapping("/thursday")
    public Object getThursday() {return new ResponseEntity<>(scheduleService.getThursday(), HttpStatus.OK); }

    @GetMapping("/friday")
    public Object getFriday() {return new ResponseEntity<>(scheduleService.getFriday(), HttpStatus.OK); }

    @GetMapping("/saturday")
    public Object getSaturday() {return new ResponseEntity<>(scheduleService.getSaturday(), HttpStatus.OK); }

    @GetMapping("/sunday")
    public Object getSunday() {return new ResponseEntity<>(scheduleService.getSunday(), HttpStatus.OK); }
*/
    @GetMapping("/{day}")
    public  Object getPartyByDay(@PathVariable String day, Model model){
        model.addAttribute("schedule", scheduleService.getPartiesByDay(day));
        return "schedule-list";
    }
    @GetMapping("/{partyId}")
    public Object getByPartyId(@PathVariable int partyId) {
        //return new ResponseEntity<>(scheduleService.getByPartyId(partyId), HttpStatus.OK);
        return "party-list";
    }

    @PostMapping("/new")
    public Object createNewSchedule(@RequestBody Schedule newSchedule) {
        /*if(this.venueId.schedule == null){*/
        //    scheduleService.createNewSchedule(newSchedule);
        /*} else { return error schedule exists}*/
        return "schedule-list";
    }

    @PutMapping("/update/{scheduleId")
    public Object updateSchedule(@PathVariable int scheduleId, @RequestBody Schedule schedule) {
       // scheduleService.updateSchedule(scheduleId, schedule);
       // return new ResponseEntity<>(scheduleService.getByPartyId);
        return "schedule-list";
    }

    @GetMapping("/delete/{scheduleId}")
    public Object deleteSchedule(@PathVariable int scheduleId, Model model){
        return "schedule-list";
    }


}
