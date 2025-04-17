package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
@Controller
@RequestMapping("/{venueId}/parties")
public class PartyController {

    @Autowired
    private PartyService partyService;

    /**
     * there is no need for an "all" parties since they should only
     * ever be found by reference
     */

    /**
     * update all rest mapping to form /{venueId}/parties/... to restrict results universally based on
     * venue
     * there's no need to have access to *all* parties, only all parties at a venue
     */

    @GetMapping("/all")
    public Object getAllParties(@PathVariable int venueId, Model model){
        //this needs to be able to reference the venueId
        //return new ResponseEntity<>(partyService.getAllParties(), HttpStatus.OK);
    }
    /**
     * this needs to be limited to parties at the venue calling the method
     * @param day
     * @return
     */
    @GetMapping("/{day}")
    public Object getPartiesByDay(@PathVariable int venueId, @PathVariable String day, Model model){
        //needs reference to venue by id
        //return new ResponseEntity<>(partyService.getPartiesByDay(day), HttpStatus.OK);
    }

    @GetMapping("/new")
    public Object createParty(@PathVariable int venueId, Model model){
        //needs reference to venue by id
        //partyService.createParty(party);
        //return new ResponseEntity<>(partyService.getAllParties(), HttpStatus.OK);
    }
    //public Object newParty(@PathVariable)
}
