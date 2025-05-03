package schedule.prototyp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/venues")

public class VenueController {

    @Autowired
    private VenueService venueService;

    @Autowired
    private PartyService partyService;

    @GetMapping("/all")
    public Object getAllVenues(Model model) {
        //return new ResponseEntity<>(venueService.getAllVenues(), HttpStatus.OK);
        model.addAttribute("venueList", venueService.getAllVenues());
        model.addAttribute("title", "All Venues");
        return "venue-home";
    }

    @GetMapping("/name")
    public Object getVenuesByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        model.addAttribute("venueList", venueService.getVenuesByName(search));
        model.addAttribute("title", "Venues by Name: " + search);
        return "venue-list";
    }

    @GetMapping("/{venueId}")
    public Object getVenueById(@PathVariable int venueId, Model model){
        model.addAttribute("venue", venueService.getVenueById(venueId));
        return "venue-home";
    }

    @GetMapping("/parties/{venueId}")
    public Object getPartiesByVenue(@PathVariable int venueId, Model model){
        model.addAttribute("partyList", partyService.getPartiesByVenue(venueId));
        return "party-list";
    }
//post new venue
    @GetMapping("/createVenue")
    public Object createVenue(Model model){
        Venue newVenue = new Venue();
        model.addAttribute("venue", newVenue);
        model.addAttribute("title", "Register a Venue");
        return "venue-create";
    }
    @PostMapping("/createVenue")
    public Object createVenue(Venue newVenue, Model model){
        venueService.createVenue(newVenue);
        //newVenue.generateSchedule(newVenue.getOpenTime(), newVenue.getCloseTime());
        return "redirect:/venues/{newVenue.getVenueId()}";
    }

    @GetMapping("/{venueId}/update")
    public Object updateVenue(@PathVariable int venueId, Model model){
        model.addAttribute("venue", venueService.getVenueById(venueId));
        return "venue-update";
    }
    @PostMapping("/{venueId}/update")
    public Object updateVenue(@PathVariable int venueId, Venue venue){
        venueService.updateVenue(venueId, venue);
        return "redirect:/venues/{venue.getVenueId()}";
    }

    @GetMapping("/delete/{venueId}")
    public Object deleteVenueById(@PathVariable int venueId){
        venueService.deleteVenueById(venueId);
        return "redirect:/login";
    }



//put modify venue profile

//delete remove venue

//post create schedule

//get list of players in parties at self

//get reviews

//post response

}
