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
    private int startMon;
    private int endMon;
    private int startTue;
    private int endTue;
    private int startWed;
    private int endWed;
    private int startThu;
    private int endThu;
    private int startFri;
    private int endFri;
    private int startSat;
    private int endSat;
    private int startSun;
    private int endSun;


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

    public int getStartMon() {
        return startMon;
    }

    public int getEndMon() {
        return endMon;
    }

    public void setStartMon(int startMon) {
        this.startMon = startMon;
    }

    public void setEndMon(int endMon) {
        this.endMon = endMon;
    }

    public int getStartTue() {
        return startTue;
    }

    public int getEndTue() {
        return endTue;
    }

    public void setStartTue(int startTue) {
        this.startTue = startTue;
    }

    public void setEndTue(int endTue) {
        this.endTue = endTue;
    }

    public int getStartWed() {
        return startWed;
    }

    public int getEndWed() {
        return endWed;
    }

    public void setStartWed(int startWed) {
        this.startWed = startWed;
    }

    public void setEndWed(int endWed) {
        this.endWed = endWed;
    }

    public int getStartThu() {
        return startThu;
    }

    public int getEndThu() {
        return endThu;
    }

    public void setStartThu(int startThu) {
        this.startThu = startThu;
    }

    public void setEndThu(int endThu) {
        this.endThu = endThu;
    }

    public int getStartFri() {
        return startFri;
    }

    public int getEndFri() {
        return endFri;
    }

    public void setStartFri(int startFri) {
        this.startFri = startFri;
    }

    public void setEndFri(int endFri) {
        this.endFri = endFri;
    }

    public int getStartSat() {
        return startSat;
    }

    public int getEndSat() {
        return endSat;
    }

    public void setStartSat(int startSat) {
        this.startSat = startSat;
    }

    public void setEndSat(int endSat) {
        this.endSat = endSat;
    }

    public int getStartSun() {
        return startSun;
    }

    public int getEndSun() {
        return endSun;
    }

    public void setStartSun(int startSun) {
        this.startSun = startSun;
    }

    public void setEndSun(int endSun) {
        this.endSun = endSun;
    }

    /**
    @ManyToMany
    @JoinColumn(name = "partyId")
    private Party party;
    **/
    //constructors


}
