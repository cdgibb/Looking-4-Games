package schedule.prototyp;

import jakarta.persistence.*;

@Entity
@Table(name = "venues")

public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venueId;

    @Column(nullable = false)
    private String venueName;
    private String venueAddress;
    private String venueBio;
    private String venueEmail;
    private String venuePassword;
    private int venueCapacity;
    private int venueOpen;
    private int venueClose;
    private boolean monday;
    private boolean tuesday;
    private boolean wednesday;
    private boolean thursday;
    private boolean friday;
    private boolean saturday;
    private boolean sunday;
    //i think the correct thing would be to make a Day class that just holds a boolean value
    //and then make a Day object for each day of the week so that they can be called at once as a table
    //but i don't know what kind of consequences that would have if you tried to make a table of all days
    //because it would probably see every day created by every venue



    public Venue(String venueName, String venueAddress, String venueBio, String venueEmail, String venuePassword, int venueCapacity){
        this.venueName = venueName;
        this.venueAddress = venueAddress;
        this.venueBio = venueBio;
        this.venueEmail = venueEmail;
        this.venuePassword = venuePassword;
        this.venueCapacity = venueCapacity;
    }

    public Venue(){

    }

    public int getVenueId() { return venueId;}

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public String getVenueBio() {
        return venueBio;
    }

    public void setVenueBio(String venueBio) {
        this.venueBio = venueBio;
    }

    public String getVenueEmail() {
        return venueEmail;
    }

    public void setVenueEmail(String venueEmail) {
        this.venueEmail = venueEmail;
    }

    public String getVenuePassword() {
        return venuePassword;
    }

    public void setVenuePassword(String venuePassword) {
        this.venuePassword = venuePassword;
    }

    public int getVenueCapacity() {
        return venueCapacity;
    }

    public void setVenueCapacity(int venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    public int getVenueOpen() {
        return venueOpen;
    }

    public void setVenueOpen(int venueOpen) {
        this.venueOpen = venueOpen;
    }

    public int getVenueClose() {
        return venueClose;
    }

    public void setVenueClose(int venueClose) {
        this.venueClose = venueClose;
    }

    public boolean isMonday() {
        return monday;
    }

    public boolean isTuesday() {
        return tuesday;
    }

    public boolean isWednesday() {
        return wednesday;
    }

    public boolean isThursday() {
        return thursday;
    }

    public boolean isFriday() {
        return friday;
    }

    public boolean isSaturday() {
        return saturday;
    }

    public boolean isSunday() {
        return sunday;
    }

    public void setMonday(boolean monday) {
        this.monday = monday;
    }

    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }

    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }

    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }

    public void setFriday(boolean friday) {
        this.friday = friday;
    }

    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }

    public void setSunday(boolean sunday) {
        this.sunday = sunday;
    }

    /**
    @ManyToMany
    @JoinColumn(name = "partyId")
    private Party party;
    **/
    //constructors


}
