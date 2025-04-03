package schedule.prototyp;

import jakarta.persistence.*;

@Entity
@Table(name = "venues")

public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venueId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false);
    private String address;

    @ManyToMany
    @JoinColumn(name = "partyId")
    private Party party;

    //constructors


}
