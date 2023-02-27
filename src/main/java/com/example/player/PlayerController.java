
package com.example.player; 
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.player.PlayerService;
 

// Write your code here.

@RestController
public class PlayerController{
    PlayerService ps = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers(){
        return ps.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return ps.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayer(@PathVariable("playerId") int playerId){
      return ps.getPlayer(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player){
        return ps.updatePlayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        ps.deletePlayer(playerId);
        }
    
}