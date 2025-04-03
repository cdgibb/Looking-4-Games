package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
     * update all rest mapping to form /{venueId}/parties/... to restrict results universally based on
     * venue
     * there's no need to have access to *all* parties, only all parties at a venue
     */

    @GetMapping("/{venueId}/parties/all")
    public Object getAllParties(@PathVariable int venueId){
        //this needs to be able to reference the venueId
        return new ResponseEntity<>(partyService.getAllParties(), HttpStatus.OK);
    }
    /**
     * this needs to be limited to parties at the venue calling the method
     * @param day
     * @return
     */
    @GetMapping("/{venueId}/parties/{day}")
    public Object getPartiesByDay(@PathVariable int venueId, @PathVariable String day){
        //needs reference to venue by id
        return new ResponseEntity<>(partyService.getPartiesByDay(day), HttpStatus.OK);
    }

    @PostMapping("/{venueId}/new")
    public Object addNewParty(@PathVariable Party party){
        //needs reference to venue by id
        partyService.addNewParty(party);
        return new ResponseEntity<>(partyService.getAllParties(), HttpStatus.OK);
    }
    //public Object newParty(@PathVariable)
}
