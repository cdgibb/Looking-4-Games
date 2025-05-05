package com.looking4games.player.Player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @Column(nullable = false)
    private Long playerId; // The player who wrote the review

    private Long venueId; // Optional: link to venue (or game session ID)

    private String reviewText;

    private int rating; // e.g., 1 to 5 stars

    @Temporal(TemporalType.TIMESTAMP)
    private Date submittedAt;
}

