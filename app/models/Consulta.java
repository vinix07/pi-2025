package models;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

import play.data.validation.InFuture;
import play.data.validation.Min;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Consulta extends Model{

	
	
	@Required
	@InFuture
	public Date data;
	
	public String tipo;
	
	@ManyToOne
	@JoinColumn(name = "animal_id")
	public Animal animal;
	
	
	@ManyToOne
	@JoinColumn(name = "veterinario_id")
	public Veterinario veterinario;
	
}
