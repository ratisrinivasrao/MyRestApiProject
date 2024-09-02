package com.rsr.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsr.model.Players;
import com.rsr.repository.TeamRepository;

@RestController
@RequestMapping("/api")
public class TeamController {
	
	@Autowired
	TeamRepository teamRepo;
	
	@PostMapping("/player")
	public String storePlayers(@RequestBody Players players) {
		teamRepo.save(players);
		return "The players details has successfully been stored";
	}
	
	@GetMapping("/players")
	public ResponseEntity<List<Players>> getAllPlayers(){
	List<Players> teamPlayer=new ArrayList<>();
		teamRepo.findAll().forEach(teamPlayer::add);
		return new ResponseEntity<List<Players>>(teamPlayer,HttpStatus.FOUND);
	}
	
	@GetMapping("/players/{player_number}")
	public ResponseEntity<Players>getPlayerDetail(@PathVariable long player_Number){
		Optional<Players> pp=teamRepo.findById(player_Number);
		if(pp.isPresent()) {
			return new ResponseEntity<Players>(pp.get(),HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<Players>(HttpStatus.NOT_FOUND);
		}
	}
@PutMapping("/players/{player_Number}")
public String updatePlayer(@PathVariable long player_Number,@RequestBody Players player) {
	Optional<Players> teamPlayer=teamRepo.findById(player_Number);
	if( teamPlayer.isPresent()) {
		Players member=teamPlayer.get();
		member.setPlayer_Age(player.getPlayer_Age());
		member.setPlayer_Name(player.getPlayer_Name());
		member.setPlayer_runs(player.getPlayer_runs());
		member.setPlayer_Speciality(player.getPlayer_Speciality());
		member.setPlayer_State(player.getPlayer_State());
		member.setPlayer_Wickets(player.getPlayer_Wickets());
		teamRepo.save(member);
		return "the player details for given id is updated";
	}
	else
	return "the player with respective id is not found ,kindly please check and correct";
}
}
