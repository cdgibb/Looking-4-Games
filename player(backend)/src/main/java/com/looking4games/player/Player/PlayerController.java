package com.looking4games.player.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService service;

    // GET all players
    @GetMapping("/all")
    public ResponseEntity<List<Player>> getAllPlayers() {
        return new ResponseEntity<>(service.getAllPlayers(), HttpStatus.OK);
    }

    // GET a single player by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getPlayerById(@PathVariable Long id) {
        Player player = service.getPlayerById(id);
        if (player == null) {
            return new ResponseEntity<>("Player not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

    // POST a new player
    @PostMapping("/new")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        return new ResponseEntity<>(service.addPlayer(player), HttpStatus.CREATED);
    }

    // PUT to update an existing player
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        Player updated = service.updatePlayer(id, player);
        if (updated == null) {
            return new ResponseEntity<>("Player not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    // DELETE a player by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Long id) {
        service.deletePlayer(id);
        return new ResponseEntity<>("Player deleted", HttpStatus.OK);
    }

    // Subscribe player to a new game
    @PutMapping("/{id}/subscribe/{gameId}")
    public ResponseEntity<?> subscribeToGame(@PathVariable Long id, @PathVariable Integer gameId) {
        Player updated = service.subscribeToGame(id, gameId);
        if (updated == null) {
            return new ResponseEntity<>("Player not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    // Unsubscribe player from a game
    @PutMapping("/{id}/unsubscribe/{gameId}")
    public ResponseEntity<?> unsubscribeFromGame(@PathVariable Long id, @PathVariable Integer gameId) {
        Player updated = service.unsubscribeFromGame(id, gameId);
        if (updated == null) {
            return new ResponseEntity<>("Player not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }


}
