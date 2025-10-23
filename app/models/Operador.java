package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class Operador  extends Model{
	
	public String email;
	
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	public Usuario usuario;
	

}



