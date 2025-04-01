package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework..http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/parties")
public class PartyController {

    @Autowired
    private PartyService partyService;

    /**
     * there is no need for an "all" parties since they should only
     * ever be found by reference
     */

    /**
     * this needs to be limited to parties at the venue calling the method
     * @param day
     * @return
     */
    @GetMapping("/parties/{day}")
    public Object getPartiesByDay(@PathVariable String day){
        return new ResponseEntity<>(partyService.getPartiesByDay(day), HttpStatus.OK);
    }

    @PostMapping("new")
    publ
}
