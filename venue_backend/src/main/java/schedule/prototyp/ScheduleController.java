package schedule.prototyp;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/monday")
    public Object getMonday() {return new ResponseEntity<>(scheduleService.getMonday(), HttpStatus.OK); }

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

    @GetMapping("/{partyId}")
    public Object getByPartyId(@PathVariable int partyId) {
        return new ResponseEntity<>(scheduleService.getByPartyId(partyId), HttpStatus.OK); }

    @PostMapping("/new")
    public Object createNewSchedule(@RequestBody Schedule newSchedule) {
        /*if(this.venueId.schedule == null){*/
            scheduleService.createNewSchedule(newSchedule);
        /*} else { return error schedule exists}*/
    }

    @PutMapping("/update/{scheduleId")
    public Object updateSchedule(@PathVariable int scheduleId, @RequestBody Schedule schedule) {
        scheduleService.updateSchedule(scheduleId, schedule);
        return new ResponseEntity<>(scheduleService.getByPartyId);
    }

    @DeleteMapping("/delete/{scheduleId}") {

    }
}
