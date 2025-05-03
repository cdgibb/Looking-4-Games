package com.looking4games.player.Player;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "players")
@Data // Lombok generates getters/setters, equals, hashCode, toString
@NoArgsConstructor // Lombok generates a no-argument constructor
@AllArgsConstructor // Lombok generates an all-argument constructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String roleType; // "Customer" for now

    private String bio;
    private String location;
    private String preferredGameStyle;

    @ElementCollection
    private List<String> availableTimes;

    @ElementCollection
    private List<Integer> activeGamesIds;

    private String status; // active, banned, inactive

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    private double distanceWillingToTravel;

    @ElementCollection
    private List<String> reviewsWritten;

    @ElementCollection
    private List<String> recentEventsAttended;

    // Add full constructor if needed later
}

