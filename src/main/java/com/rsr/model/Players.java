package com.rsr.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="playerstable")
public class Players {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private long player_Number;
	@Column(name = "Name")
	private String player_Name;
	@Column(name="State")
	private String player_State;
	@Column(name="Age")
	private int player_Age;
	@Column(name="Speciality")
	private String player_Speciality;
	@Column(name="Runs")
	private long player_runs;
	@Column(name="Wickets")
	private int player_Wickets;
	
	
	
	public Players() {
		super();
	}

	public Players(long player_Number, String player_Name, String player_State, int player_Age,
			String player_Speciality, long player_runs, int player_Wickets) {
		super();
		this.player_Number = player_Number;
		this.player_Name = player_Name;
		this.player_State = player_State;
		this.player_Age = player_Age;
		this.player_Speciality = player_Speciality;
		this.player_runs = player_runs;
		this.player_Wickets = player_Wickets;
	}

	public long getPlayer_Number() {
		return player_Number;
	}

	public void setPlayer_Number(long player_Number) {
		this.player_Number = player_Number;
	}

	public String getPlayer_Name() {
		return player_Name;
	}

	public void setPlayer_Name(String player_Name) {
		this.player_Name = player_Name;
	}

	public String getPlayer_State() {
		return player_State;
	}

	public void setPlayer_State(String player_State) {
		this.player_State = player_State;
	}

	public int getPlayer_Age() {
		return player_Age;
	}

	public void setPlayer_Age(int player_Age) {
		this.player_Age = player_Age;
	}

	public String getPlayer_Speciality() {
		return player_Speciality;
	}

	public void setPlayer_Speciality(String player_Speciality) {
		this.player_Speciality = player_Speciality;
	}

	public long getPlayer_runs() {
		return player_runs;
	}

	public void setPlayer_runs(long player_runs) {
		this.player_runs = player_runs;
	}

	public int getPlayer_Wickets() {
		return player_Wickets;
	}

	public void setPlayer_Wickets(int player_Wickets) {
		this.player_Wickets = player_Wickets;
	}

	@Override
	public String toString() {
		return "Players [player_Number=" + player_Number + ", player_Name=" + player_Name + ", player_State="
				+ player_State + ", player_Age=" + player_Age + ", player_Speciality=" + player_Speciality
				+ ", player_runs=" + player_runs + ", player_Wickets=" + player_Wickets + "]";
	}
	
}
