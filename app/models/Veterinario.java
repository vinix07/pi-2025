package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class Veterinario extends Model{

	public String nome;
	public String crm;
	
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	public Usuario usuario;
	
	
}
