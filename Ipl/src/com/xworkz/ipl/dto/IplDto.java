package com.xworkz.ipl.dto;

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
@Table(name = "Ipl_table")
//@NamedQuery(name = "findByiplTeam",query = "select dto from IplDto dto where dto.iplTeam=:it")
@NamedQuery(name = "findByJerseyColors",query = "select dto from IplDto dto where dto.jerseyColors=:jc")

public class IplDto implements Serializable {

	@Id
	private int id;
	private String iplTeam;
	private String jerseyColors;
	private int members;
	private String goal;

}
