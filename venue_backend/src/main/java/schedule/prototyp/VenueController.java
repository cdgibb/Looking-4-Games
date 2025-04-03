package schedule.prototyp;

@Controller
@RequestMapping("/venues")

public class VenueController {

    @Autowired
    private VenueService venueService;

    @Autowired
    private PartyService partyService;

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
//post new venue

//put modify venue profile

//delete remove venue

//post create schedule

//get list of players in parties at self

//get reviews

//post response

}
