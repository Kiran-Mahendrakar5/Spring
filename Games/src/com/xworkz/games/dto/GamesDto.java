package com.xworkz.games.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Games_table")
@NamedQuery(name = "findByiplTeam",query = "select dto from GamesDto dto where dto.iplTeam=:it")

public class GamesDto implements Serializable {

	@Id
	private int id;
	private String iplTeam;
	private String jerseyColors;
	private int members;
	private String goal;

}
