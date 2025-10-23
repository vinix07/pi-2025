package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Animal extends Model{

	
	public String nome;
	public String peso;
	public String especie;
	
	@ManyToOne
	@JoinColumn(name = "tutor_id")
	public Tutor tutor;
	
}
