package schedule.prototyp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venues")

public class VenueController {

    @Autowired
    private VenueService venueService;

    @Autowired
    private PartyService partyService;

    @GetMapping("/all")
    public Object getAllVenues(){return new ResponseEntity<>(venueService.getAllVenues(), HttpStatus.OK);}

    @GetMapping("/{venueId}")
    public Object getOneVenue(){return new ResponseEntity<>(venueService.getVenueById(venueId), HttpStatus.OK);}

    @GetMapping("/{venueId}/open")
    public Object getVenueOpen(){return new ResponseEntity<>(venueService.getVenueOpen(), HttpStatus.OK);}

    @GetMapping("/{venueId}/close")
    public Object getVenueClose(){return new ResponseEntity<>(venueService.getVenueClose(), HttpStatus.OK);}

    //this is where i would put the get for every day if i knew how to handle it
    @GetMapping("/{venueId}/capacity")
    public Object getVenueCapacity(){return new ResponseEntity<>(venueService.getVenueCapacity(), HttpStatus.OK);}

    @PutMapping("/update/{venueId}")
    public Object updateVenue(@PathVariable int venueId, @RequestBody Venue venue){
        venueService.updateVenue(venueId, venue);
        return new ResponseEntity<>(venueService.getVenueById(venueId), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{venueId}")
    public Object deleteVenueById(@PathVariable int venueId){
        venueService.deleteVenueById(venueId);
        return new ResponseEntity<>(venueService.getAllVenues(), HttpStatus.OK);
    }


    /**
    @GetMapping("/all")
    public Object getAllVenues(Model model) {
        model.addAttribute("venueList", venueService.getAllVenues());
        model.addAttribute("title", "All Venues");
        return "venue-list";
    }

    @GetMapping("/name")
    public Object getVenuesByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        model.addAttribute("venueList", venueService.getVenuesByName(search));
        model.addAttribute("title", "Venues by Name: " + search);
        return "venue-list";
    }

    @GetMapping("/parties")
    public Object get
    **/
//post new venue

//put modify venue profile

//delete remove venue

//post create schedule

//get list of players in parties at self

//get reviews

//post response

}
